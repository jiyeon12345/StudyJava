package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

public class ShakerSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����� ���� ����(����Ŀ ����)");
		System.out.print("��ڼ� : ");
		int nx = scan.nextInt();
		int[] arr = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			arr[i] = scan.nextInt();
		}

		shakerSort(arr, nx);				// �迭 x�� ����� ���� ����

		System.out.println("������������ �����Ͽ����ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]��" + arr[i]);
	}

	static void shakerSort(int[] a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;

		while (left < right){
			for (int j = right; j > left; j--){
				if (a[j - 1] > a[j]){
					swap(a, j - 1, j);
					last = j;
				}
			}
			left = last;

			for (int j = left; j < right; j++){
				if (a[j] > a[j + 1]){
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
		}
	}

	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}

}
