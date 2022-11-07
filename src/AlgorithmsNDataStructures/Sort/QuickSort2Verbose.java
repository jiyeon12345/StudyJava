package AlgorithmsNDataStructures.Sort;

//����6-11
//�� ����(����� ���� : ���ÿ� Ǫ�� ���ϴ� ������ ���)

import java.util.Scanner;

class QuickSort2Verbose {

	//--- �迭�� ��� a[idx1]�� a[idx2]�� ��ȯ ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
	}

	//--- �� ����(����� ����)---//
	static void quickSort(int[] a, int left, int right) {
		IntStack lstack = new IntStack(right-left+1);
		IntStack rstack = new IntStack(right-left+1);

		lstack.push(left);
		rstack.push(right);
		System.out.printf("a[%d]~a[%d]�� ������ ������ ���ÿ� Ǫ���մϴ�.\n", left, right);
		System.out.print("Lstack:"); lstack.dump();
		System.out.print("Rstack:"); rstack.dump();

		while (lstack.isEmpty() != true) {
			int pl = left  = lstack.pop();			// ���� Ŀ��
			int pr = right = rstack.pop();			// ������ Ŀ��
			int x = a[(left + right) / 2];			// �ǹ��� ��� ���
			System.out.printf("���ÿ��� ������ ������ ���½��ϴ�. a[%d]~a[%d]�� �����ϴ�.\n", left, right);

			do {
				while (a[pl] < x) pl++;
				while (a[pr] > x) pr--;
				if (pl <= pr)
					swap(a, pl++, pr--);
			} while (pl <= pr);

			if (left < pr) {
				lstack.push(left);			// ���� �׷� ������
				rstack.push(pr);				// �ε����� Ǫ��
				System.out.printf("a[%d]~a[%d]�� ������ ������ ���ÿ� Ǫ���մϴ�.\n", left, pr);
				System.out.print("Lstack:"); lstack.dump();
				System.out.print("Rstack:"); rstack.dump();
			}
			if (pl < right) {
				lstack.push(pl);				// ������ �׷� ������
				rstack.push(right);			// �ε����� Ǫ��
				System.out.printf("a[%d]~a[%d]�� ������ ������ ���ÿ� Ǫ���մϴ�.\n", pl, right);
				System.out.print("Lstack:"); lstack.dump();
				System.out.print("Rstack:"); rstack.dump();
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�� ����");
		System.out.print("��ڼ� : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		quickSort(x, 0, nx - 1);			// �迭 x�� �� ����

		System.out.println("������������ �����Ͽ����ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}
}

