package StudyjavaMain;

import java.util.Scanner;

public class DifferincePractic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("a값 : ");
//		int a = scan.nextInt();
//		
//		int b = 0;
//		
//		do {
//			if(a <= b) {System.out.println("a보다 큰 값을 입력하세요!");}
//			System.out.print("b값 : ");
//			b = scan.nextInt();
//		}while(a >= b);
//		
//		System.out.println("b-a는"+ (b-a) +"입니다.");
		
		System.out.print("정수 입력 :");
		int a = scan.nextInt();
		
		int count = 0;
		while(a > 0) {
			a /= 10;
			count++;
		}
		System.out.println(count+"자리입니다.");
		
	}

}
