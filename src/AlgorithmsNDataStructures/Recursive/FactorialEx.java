package AlgorithmsNDataStructures.Recursive;
//문제1. factorial 메서드를 재귀 메서드 호출을 사용하지 말고 작성해라

import java.util.Scanner;

public class FactorialEx {

	static int factorial(int x) {
		int fact = 1;
		
		while(x > 1) 
			fact *= x--;
		return fact;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오");
		int num = scan.nextInt();
		System.out.printf("%d의 팩토리얼은 %d입니다.", num, factorial(num));
	}

}
