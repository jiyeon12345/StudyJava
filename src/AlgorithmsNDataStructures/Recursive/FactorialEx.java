package AlgorithmsNDataStructures.Recursive;
//����1. factorial �޼��带 ��� �޼��� ȣ���� ������� ���� �ۼ��ض�

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
		
		System.out.print("������ �Է��Ͻÿ�");
		int num = scan.nextInt();
		System.out.printf("%d�� ���丮���� %d�Դϴ�.", num, factorial(num));
	}

}
