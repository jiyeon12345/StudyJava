package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        System.out.println("�ܼ� ���� ����");
        System.out.print("��ڼ�: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        selectionSort(x, nx);            // �迭 x�� �ܼ���������

        System.out.println("������������ �����߽��ϴ�.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }

	private static void selectionSort(int[] arr, int num) {
		// i�� num-1������ ���� ������ ���� j�� Ȯ�����ش�. j�� i���� ���ϱ� ���� i+1���� ���������� �˻�
		for(int i = 0; i < num -1; i++) {
			int min = i; //i�� ���� ���Ƿ� min���� ����
			for(int j = i+1; j < num; j++)
				if(arr[j] < arr[min])
					min = j; //�ּҰ����� ������ ���� min�� j��° ������ ũ�ٸ� �� ����.
			swap(arr,i,min);
		}
	}

	private static void swap(int[] arr, int i, int min) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[min];
		arr[min] = temp;
		
	}

}
