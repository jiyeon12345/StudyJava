// ����1-15
// Ư������ *���� �Ƕ�̵带 ���
package StudyjavaMain;

import java.util.Scanner;

class StarPira {

	//--- Ư������ * �� �����Ͽ� �Ƕ�̵带 ��� ---//
	static void spira(int n) {
		for (int i = 1; i <= n; i++) {					// i ��( i = 1, 2, ... , n )
			for (int j = 1; j <= n - i; j++)			// n - i ���� ' ' �� ���
				System.out.print(' ');
			for (int j = 1; j <= (i-1)*2+1; j++)	// (i - 1) * 2 + 1 ���� '*' �� ���
				System.out.print('*');
			System.out.println();									// �ٹٲ�
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("�Ƕ�̵带 ����մϴ�.");

		do {
			System.out.print("�ܼ���  : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		spira(n);					// �Ƕ�̵带 ���
	}
}


