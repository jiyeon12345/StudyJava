package AlgorithmsNDataStructures.Sort;
//연습6-10
//셸 정렬(버전 1 : 요소의 이동 회수를 카운트)
import java.util.Scanner;

public class ShellSort1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("셸 정렬");
		System.out.print("요솟수 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		int count = shellSort(x, nx);		// 배열 x를 셸 정렬

		System.out.println("오름차순으로 정렬하였습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
		System.out.println("요소의 이동 회수는 " + count + "회입니다.");
	}

	private static int shellSort(int[] a, int n) {
		int count = 0;										// 이동 회수
		for (int h = n / 2; h > 0; h /= 2)
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					count++;
				}
				a[j + h] = tmp;
				count++;
			}
		return count;
	}
}
