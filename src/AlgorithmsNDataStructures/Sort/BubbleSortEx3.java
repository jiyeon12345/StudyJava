package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

public class BubbleSortEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순교환정렬(버블 정렬)");
		System.out.print("요솟수 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx);				// 배열 x를 단순교환정렬

		System.out.println("오름차순으로 정렬하였습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}

	private static void bubbleSort(int[] arr, int num) {
		// TODO Auto-generated method stub
		int ccnt = 0; //비교 회수
		int scnt = 0; // 교환 회수

		int i = 0;
		int k = 0;
		while(k < num -1) {
			System.out.printf("패스%d : \n", ++i);
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
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환을 " + scnt + "회 했습니다.");
	}

	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}

}
