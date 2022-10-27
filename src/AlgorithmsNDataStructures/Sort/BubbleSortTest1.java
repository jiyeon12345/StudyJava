package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

//연습6-1
//단순교환정렬(각 패스를 앞쪽 → 뒤쪽 순서로 수행)

public class BubbleSortTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단순교환 정렬 : 버블");
		System.out.print("욧소수 :");
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
		// index1 -> 마지막으로 검사하는 방법
		// j가 0부터 검사하면, 마지막 값은 이미 나온거기 때문에 i는 --을 하면서 검색 범위를 좁혀간다!(주의)
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
