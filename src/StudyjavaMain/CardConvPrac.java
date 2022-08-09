package StudyjavaMain;

import java.util.Arrays;

// �Է� ���� 10�� ������ 2���� ~ 36������ ��� ��ȯ�Ͽ� ���(��ȯ ������ ���)

import java.util.Scanner;

class CardConvPrac {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNum;
		int standard;
		char [] arr = new char[32];
		int clacLength;
		
		do {
			System.out.printf("10������ ����� ��ȯ�մϴ�.\n ��ȯ�ϴ� ���� �ƴ� ���� : ");
			inputNum = scan.nextInt();
		}while(inputNum < 0);
		
		do {
			System.out.print("������� ��ȯ�ұ��?(2~36) :");
			standard = scan.nextInt();
		}while(standard < 2 || standard > 36);
		
		clacLength = cardConEx(inputNum, standard, arr);
		
		System.out.printf("%d������",standard);
		for(int i= 0; i < clacLength; i++) {
			System.out.print(arr[i]);
		}
		System.out.print("�Դϴ�.");
		
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
