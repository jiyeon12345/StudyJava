package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

public class ShellSort {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        System.out.println("�� ����(���� 1)");
        System.out.print("��ڼ�: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        shellSort(x, nx);            // �迭 x�� ������

        System.out.println("������������ �����߽��ϴ�.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }

	private static void shellSort(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int h = n/2; h> 0; h/=2) {
			for(int i = h; i< n; i++) {
				int j;
				int tmp = a[i];
				for(j = i-h; j>=0 && a[j] > tmp; j-=h) {
					a[j+h] = a[j];
				}
				a[j+h] = tmp;
			}
		}
	}

}
