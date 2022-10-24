package AlgorithmsNDataStructuresRecursive;

import java.util.Scanner;

//팩토리얼 값을 재귀적으로 구함(조건 연산자를 사용)
public class Factorial2 {
	
	static int factorial(int n) {
		return (n > 0) ? n * factorial(n-1) : 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = scan.nextInt();
		
		System.out.printf("%d의 팩토리얼은 %d 입니다.", num, (factorial(num)));

	}

}
