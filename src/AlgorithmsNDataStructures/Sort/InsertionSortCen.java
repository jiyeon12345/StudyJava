package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

public class InsertionSortCen {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�ܼ���������");
		System.out.print("��ڼ� : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx + 1];						// �������� 1�� �� ����

		for (int i = 1; i <= nx; i++) {				// x[1]~x[nx]�� �Է� ����
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		insertionSort(x, nx + 1);							// �迭 x�� �ܼ���������

		System.out.println("������������ �����Ͽ����ϴ�.");
		for (int i = 1; i <= nx; i++)
			System.out.println("x[" + i + "]��" + x[i]);
	}

	private static void insertionSort(int[] x, int n) {
		// TODO Auto-generated method stub
		for(int i = 2; i < n; i++) {
			int tmp = x[0] = x[i];
			int j = i;
			for(; x[j-1] > tmp; j--)
				x[j] = x[j-1];
			if(j > 0) 
				x[j] = tmp;
		}
	}
}
