package StudyjavaMain;

import java.util.Scanner;

public class DifferincePractic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("a�� : ");
//		int a = scan.nextInt();
//		
//		int b = 0;
//		
//		do {
//			if(a <= b) {System.out.println("a���� ū ���� �Է��ϼ���!");}
//			System.out.print("b�� : ");
//			b = scan.nextInt();
//		}while(a >= b);
//		
//		System.out.println("b-a��"+ (b-a) +"�Դϴ�.");
		
		System.out.print("���� �Է� :");
		int a = scan.nextInt();
		
		int count = 0;
		while(a > 0) {
			a /= 10;
			count++;
		}
		System.out.println(count+"�ڸ��Դϴ�.");
		
	}

}
