package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

public class BubbleSortTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ܼ� ��ȯ ���� : ����");
		System.out.print("��Ҽ� :");
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i =0 ; i <num ; i++) {
			System.out.printf("arr[%d] :",i);
			arr[i] = scan.nextInt();
		}
		
		bubbleSort(arr);
		
		System.out.println("������������ �����Ͽ����ϴ�.");
		for (int i = 0; i < num; i++)
			System.out.printf("arr[%d]�� %d ",i , arr[i]);
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int ccnt = 0; //��Ƚ��
		int scnt = 0; //��ȯ Ƚ��
		
		for(int i= 0; i < arr.length-1; i++) {
			System.out.printf("�н� %d\n",i+1);
			for(int j = arr.length-1; j > i ; j--) {
				for(int m =0; m < arr.length-1; m++) {
					System.out.printf("%3d %c", arr[m], (m != j-1)? ' ' : (arr[j-1] > arr[j]) ? '+' : '-');
				}
				System.out.printf("%3d\n", arr[arr.length-1]);
				
				ccnt++;
				if(arr[j-1] > arr[j]) {
					scnt++;
					swap(arr, j-1, j);
				}
				for(int m=0; m< arr.length; m++) {
					System.out.printf("%3d  ", arr[m]);
				}
				System.out.println();
			}
			System.out.printf("�񱳸� %d�� �߽��ϴ�.",ccnt);
			System.out.printf("��ȯ�� %d�� �߽��ϴ�.",scnt);
		}
	}

	private static void swap(int[] arr, int idx1, int idx2) {
		int t = arr[idx1]; arr[idx1] = arr[idx2]; arr[idx2] = t;
		
	}

}
