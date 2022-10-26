package AlgorithmsNDataStructures.Recursive;

//����5-4
//��Ϳ� ���� ���ظ� ���̱� ���� ��� �޼��� recur2 �м�

/*
	�����(Top Down) �м��� �����մϴ�.

	�����(Bottom Up) �м��� �����ϸ� �Ʒ�ó�� �˴ϴ�.
	recur2(-1) (�ƹ��͵� ������� ����)
	recur2(0)  (�ƹ��͵� ������� ����)
	recur2(1)   recur2(-1) 1 recur2(0)    1
	recur2(2)   recur2(0) 2 recur2(1)     21
	recur2(3)   recur2(1) 3 recur2(2)     1321
	recur2(4)   recur2(2) 4 recur2(3)     2141321
*/

import java.util.Scanner;

class Recur2 {

	//--- ��� �޼��� ---//
	static void recur(int n) {
		if (n > 0) {
			recur(n - 2);
			System.out.println(n);
			recur(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int x = stdIn.nextInt();

		recur(x);
	}
}
