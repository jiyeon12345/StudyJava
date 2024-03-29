package AlgorithmsNDataStructures.Sort;

import java.util.Scanner;

public class InsertionSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순삽입정렬");
		System.out.print("요솟수 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		insertionSort(x, nx);			// 배열 x를 단순삽입정렬

		System.out.println("오름차순으로 정렬하였습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}

	
	static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			for (int m = 0; m < n; m++)
				System.out.printf("%3d ", a[m]);
			System.out.println();

			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			a[j] = tmp;

//			String t1 = " ";
//			String t2 = "-".repeat(4 * (i - j));
//			System.out.print(t1.repeat(4 * j));
//			System.out.print(i != j ? "^-" : "  ");
//			System.out.print(t2);
//			System.out.println("+");
//			System.out.printf("a[%d]의 %d을 a[%d]의 위치에 삽입하였습니다.\n\n", i, tmp, j);
		}
	}

}
