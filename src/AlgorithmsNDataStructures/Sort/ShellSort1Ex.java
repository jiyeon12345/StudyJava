package AlgorithmsNDataStructures.Sort;
//����6-10
//�� ����(���� 1 : ����� �̵� ȸ���� ī��Ʈ)
import java.util.Scanner;

public class ShellSort1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�� ����");
		System.out.print("��ڼ� : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		int count = shellSort(x, nx);		// �迭 x�� �� ����

		System.out.println("������������ �����Ͽ����ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]��" + x[i]);
		System.out.println("����� �̵� ȸ���� " + count + "ȸ�Դϴ�.");
	}

	private static int shellSort(int[] a, int n) {
		int count = 0;										// �̵� ȸ��
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
