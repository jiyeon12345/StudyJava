package AlgorithmsNDataStructuresRecursive;

import java.util.Scanner;

//���丮�� ���� ��������� ����(���� �����ڸ� ���)
public class Factorial2 {
	
	static int factorial(int n) {
		return (n > 0) ? n * factorial(n-1) : 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int num = scan.nextInt();
		
		System.out.printf("%d�� ���丮���� %d �Դϴ�.", num, (factorial(num)));

	}

}
