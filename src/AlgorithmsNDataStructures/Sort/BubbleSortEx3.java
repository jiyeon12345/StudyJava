package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

public class BubbleSortEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�ܼ���ȯ����(���� ����)");
		System.out.print("��ڼ� : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx);				// �迭 x�� �ܼ���ȯ����

		System.out.println("������������ �����Ͽ����ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]��" + x[i]);
	}

	private static void bubbleSort(int[] arr, int num) {
		// TODO Auto-generated method stub
		int ccnt = 0; //�� ȸ��
		int scnt = 0; // ��ȯ ȸ��

		int i = 0;
		int k = 0;
		while(k < num -1) {
			System.out.printf("�н�%d : \n", ++i);
			int last = num-1;
			for(int j = num-1; j > k; j--) {
				for(int m = 0 ; m < num-1; m++) {
					System.out.printf("%3d %c" , arr[m], (m != j-1) ? ' ' : (arr[j-1] > arr[j])? '+' : '-');
				}
				System.out.printf("%3d\n",arr[num-1]);
				ccnt++;
				if(arr[j-1] > arr[j]) {
					swap(arr,j-1,j);
					last = j;
					scnt++;
				}	
			}
			k = last;
		}
		System.out.println("�񱳸� " + ccnt + "ȸ �߽��ϴ�.");
		System.out.println("��ȯ�� " + scnt + "ȸ �߽��ϴ�.");
	}

	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}

}
