package AlgorithmsNDataStructures.StackNQueue;

import java.util.Scanner;

public class IntStackTestExGenericsVer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StackGenerics<String> s = new StackGenerics(64);
		
		while(true) {
			System.out.printf("���� ������ ���� : %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1) Ǫ�� (2) �� (3) ��ũ " +
											 "(4) ���� (5) �˻� (6) ��� " +
											 "(7) ��� (0) ���� : ");

			int menu = scan.nextInt();
			if (menu == 0) break;

			String x;
		}
		
	}

}
