package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        System.out.println("단순 선택 정렬");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        selectionSort(x, nx);            // 배열 x를 단순선택정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }

	private static void selectionSort(int[] arr, int num) {
		// i는 num-1까지로 지정 마지막 값은 j가 확인해준다. j는 i값과 비교하기 위해 i+1부터 마지막까지 검사
		for(int i = 0; i < num -1; i++) {
			int min = i; //i의 값을 임의로 min으로 지정
			for(int j = i+1; j < num; j++)
				if(arr[j] < arr[min])
					min = j; //최소값으로 지정해 놓은 min이 j번째 값보다 크다면 값 변경.
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
