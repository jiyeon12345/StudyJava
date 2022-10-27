package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

public class BubbleSortTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단순 교환 정렬 : 버블");
		System.out.print("욧소수 :");
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i =0 ; i <num ; i++) {
			System.out.printf("arr[%d] :",i);
			arr[i] = scan.nextInt();
		}
		
		bubbleSort(arr);
		
		System.out.println("오름차순으로 정렬하였습니다.");
		for (int i = 0; i < num; i++)
			System.out.printf("arr[%d]＝ %d ",i , arr[i]);
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int ccnt = 0; //비교횟수
		int scnt = 0; //교환 횟수
		
		for(int i= 0; i < arr.length-1; i++) {
			System.out.printf("패스 %d\n",i+1);
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
			System.out.printf("비교를 %d번 했습니다.",ccnt);
			System.out.printf("교환을 %d번 했습니다.",scnt);
		}
	}

	private static void swap(int[] arr, int idx1, int idx2) {
		int t = arr[idx1]; arr[idx1] = arr[idx2]; arr[idx2] = t;
		
	}

}
