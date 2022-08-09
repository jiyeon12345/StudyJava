package StudyjavaMain;

import java.util.Arrays;

// 입력 받은 10진 정수를 2진수 ~ 36진수로 기수 변환하여 출력(변환 과정을 출력)

import java.util.Scanner;

class CardConvPrac {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNum;
		int standard;
		char [] arr = new char[32];
		int clacLength;
		
		do {
			System.out.printf("10진수를 기수로 변환합니다.\n 변환하는 음이 아닌 정수 : ");
			inputNum = scan.nextInt();
		}while(inputNum < 0);
		
		do {
			System.out.print("어떤진수로 변환할까요?(2~36) :");
			standard = scan.nextInt();
		}while(standard < 2 || standard > 36);
		
		clacLength = cardConEx(inputNum, standard, arr);
		
		System.out.printf("%d진수로",standard);
		for(int i= 0; i < clacLength; i++) {
			System.out.print(arr[i]);
		}
		System.out.print("입니다.");
		
	}

	private static int cardConEx(int inputNum, int standard, char[] arr) {
		// TODO Auto-generated method stub
		int n = ((Integer)inputNum).toString().length();
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.printf("%2d | %3d\n", standard, inputNum);
		
		do {
			System.out.printf("   +");
			for(int i = 0 ; i < n+2; i++) {
				System.out.print("-");
			}
			
			System.out.println();
			
			if(inputNum/standard !=0) {
				System.out.printf("%2d | %3d  ... %2d\n", standard, inputNum/standard,inputNum%standard);
			}else {
				System.out.printf("     %3d  ... %2d\n", inputNum/standard,inputNum%standard);
			}
			
			arr[digits++] = dchar.charAt(inputNum%standard);
			inputNum /= standard;
			
		}while(inputNum != 0);
		
		
		for(int i = 0 ; i < digits/2; i++) {
			char t = arr[i];
			arr[i] = arr[digits-1-i] ;
			arr[digits -1 -i] = t;
		}
		
		
		return digits;
	}
}
