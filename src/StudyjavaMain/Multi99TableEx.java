package StudyjavaMain;

import java.util.Scanner;

class Multi99TableEx {

	public static void main(String[] args) {

//		System.out.print("   |");
//		for (int i = 1;i <= 9; i++)
//			System.out.printf("%3d", i);
//		System.out.println("\n---+---------------------------");
//
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%2d |", i);
//			for (int j = 1; j <= 9; j++)
//				System.out.printf("%3d", i * j);
//			System.out.println();
//		}
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("정사각형을 출력합니다.");
//		System.out.println("변의 길이");
//		int a = scan.nextInt();
//		
//		for(int i=0; i < a ; i++) {
//			for(int j =0; j < a ; j ++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		int n;
//		do {
//			System.out.println("삼각형?");
//			n = scan.nextInt();
//		}while(n <= 0);
		
//		for(int i = 0; i <n; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 1; j <= 3-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		System.out.println("왜안돼");
		for(int i = 0; i <= 4; i++) {
			for(int j = 0 ; i <= 4-i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (i-1)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
