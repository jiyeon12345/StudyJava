package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

public class SelectionSortEx {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�ܼ���������");
		System.out.print("��ڼ� : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		selectionSort(x, nx);			// �迭 x�� �ܼ���������

		System.out.println("������������ �����Ͽ����ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]��" + x[i]);
	}

	private static void selectionSort(int[] x, int nx) {
		// TODO Auto-generated method stub
		for(int i = 0; i< nx-1; i++) {
			int min = i;
			for(int j = i; j <nx ; j++) {
				if(x[j] < x[min])
					min = j;
			}
			for(int m = 0; m < nx ; m++) {
				System.out.print((m==i)? "  * " : (m == min)? "  + " : "    ");
			}
			System.out.println();
			
			for(int m = 0; m <nx; m++) {
				System.out.printf("%3d", x[m]);
			}
			System.out.println();
			swap(x,i,min);
		}
	}

	private static void swap(int[] x, int i, int min) {
		// TODO Auto-generated method stub
		int temp = x[i];
		x[i] = x[min];
		x[min] = temp;
	}

}
