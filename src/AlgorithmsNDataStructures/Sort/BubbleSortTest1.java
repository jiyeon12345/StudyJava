package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

//����6-1
//�ܼ���ȯ����(�� �н��� ���� �� ���� ������ ����)

public class BubbleSortTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ܼ���ȯ ���� : ����");
		System.out.print("��Ҽ� :");
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0 ; i< num; i++) {
			System.out.printf("x[%d] :", i);
			arr[i] = scan.nextInt();
		}
		
		bubbleSort(arr, num);
		
		for(int i = 0; i < arr.length; i ++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		
	}

	private static void bubbleSort(int[] arr, int num) {
		// index1 -> ���������� �˻��ϴ� ���
		// j�� 0���� �˻��ϸ�, ������ ���� �̹� ���°ű� ������ i�� --�� �ϸ鼭 �˻� ������ ��������!(����)
		for(int i = num-1; i > 0; i--) {
			for(int j = 0; j<i; j++) {
				if(arr[j] > arr[j+1])
					swap(arr, j, j+1);
			}
		}
	}

	private static void swap(int[] arr, int idx1, int idx2) {
		// TODO Auto-generated method stub
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

}
