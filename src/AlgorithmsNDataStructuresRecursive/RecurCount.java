package AlgorithmsNDataStructuresRecursive;

//����5-5(1)
//��Ϳ� ���� ���ظ� ���̱� ���� ��� �޼���(ȣ���� ȸ���� ī��Ʈ)

import java.util.Scanner;

class RecurCount {

	static int count;

	//--- ��� �޼��� ---//
	static void recur(int n) {
		count++;
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int x = stdIn.nextInt();

		recur(x);

		System.out.println("�޼��带 ȣ���� ȸ�� : " + count);		
	}
}
