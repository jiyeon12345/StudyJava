package StudyjavaMain;

import java.util.Arrays;

public class ReverseArrayPrac1 {

	
	public static void main(String[] args) {
		// arr������ �������� ����ϱ�
		int [] arr = {2,5,1,3,9,6,7};
		System.out.println(Arrays.toString(arr));
		
		//findReverse(arr);
		//sumOf(arr);
		
		int [] arr2 = new int[arr.length];
		//copy(arr, arr2);
		rcopy(arr, arr2);
		
	}

	private static void rcopy(int[] arr, int[] arr2) {
		// TODO Auto-generated method stub
		for(int i=0 ; i < arr.length ; i++) {
			arr2[i] = arr[arr.length-1-i];
		}
		System.out.println("arr2 : " +Arrays.toString(arr2));
	}

	private static void copy(int[] arr, int[] arr2) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		System.out.println("arr2 : " +Arrays.toString(arr2));
	}

	private static void findReverse(int[] arr) {
		// reverse�޼ҵ�� �������� �߰� �ܰ�, main���� ���� ������� ������
		for(int i = 0; i < arr.length/2; i ++) {
			System.out.printf("a[%d]�� a[%d]�� ��ȯ�մϴ�.\n", i, arr.length-i-1);
			reserve(arr, i, arr.length-i-1);
		}
		
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}

	private static void sumOf(int[] arr) {
		// �� �հ� ���ϱ�
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.printf("�� ���� %d �Դϴ�.\n", sum);
	}

	private static void reserve(int[] arr, int i, int j) {
		// �� �� + �� �� ���� ���������� �ٲ� 
		int num = arr[i];
		arr[i] = arr[j];
		arr[j] = num;
		
		System.out.println(Arrays.toString(arr));
	}

}
