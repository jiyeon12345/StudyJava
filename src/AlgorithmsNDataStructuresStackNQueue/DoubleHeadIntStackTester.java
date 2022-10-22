package AlgorithmsNDataStructuresStackNQueue;

//����4-3
//�Ӹ��� ���� int�� ���� ���� ������ ��� ��(DoubleHeadIntStackTesterŬ������ ��� �޼��� �� ���)

import java.util.Scanner;

class DoubleHeadIntStackTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		DoubleHeadIntStack s = new DoubleHeadIntStack(64);	// �ִ� 64�� Ǫ���� �� �ִ� �Ӹ��� ���� ����

		while (true) {
			System.out.println("���� ������ ���� : "+
												 "A : " + s.size(DoubleHeadIntStack.AorB.StackA) + "/" + 
												 "B : " + s.size(DoubleHeadIntStack.AorB.StackB));
			System.out.print("( 1) A Ǫ�� ( 2) A �� ( 3) A ��ũ " + "( 4) A ���� ( 5) A �˻� ( 6) A ���\n" +
							 "( 7) B Ǫ�� ( 8) B �� ( 9) B ��ũ " + "(10) B ���� (11) B �˻� (12) B ���\n" +
							 "(13)   ��� ( 0) ���� : ");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int n, x = 0;
			switch (menu) {
			 case 1:													// A�� Ǫ��
				System.out.print("������ : ");
				x = stdIn.nextInt();
				try {
					s.push(DoubleHeadIntStack.AorB.StackA, x);
				 } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			 case 2:													// A���� ��
				try {
					 x = s.pop(DoubleHeadIntStack.AorB.StackA);
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				 } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			 case 3:													// A���� ��ũ
				try {
					 x = s.peek(DoubleHeadIntStack.AorB.StackA);
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				 } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			 case 4:													// A�� ����
				s.dump(DoubleHeadIntStack.AorB.StackA);
				break;

			 case 5:													// A���� �˻�
				System.out.print("�˻��� ������ : ");
				x = stdIn.nextInt();
				n = s.indexOf(DoubleHeadIntStack.AorB.StackA, x);
				if (n >= 0)
					System.out.println("����⿡�� " + (s.size(DoubleHeadIntStack.AorB.StackA) - n) +"��°�� �ֽ��ϴ�.");
				else
					System.out.println("�� �����Ͱ� �����ϴ�.");
				break;

			 case 6:													// ���ϴ�
				s.clear(DoubleHeadIntStack.AorB.StackA);
				break;

			 case 7:													// B�� Ǫ��
				System.out.print("������ : ");
				x = stdIn.nextInt();
				try {
					s.push(DoubleHeadIntStack.AorB.StackB, x);
				 } catch (DoubleHeadIntStack.OverflowDoubleHeadIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			 case 8:													// B���� ��
				try {
					 x = s.pop(DoubleHeadIntStack.AorB.StackB);
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				 } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			 case 9:													// B���� ��ũ
				try {
					 x = s.peek(DoubleHeadIntStack.AorB.StackB);
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				 } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			 case 10:													// B�� ����
				s.dump(DoubleHeadIntStack.AorB.StackB);
				break;

			 case 11:													// B���� �˻�
				System.out.print("�˻��� ������ : ");
				x = stdIn.nextInt();
				n = s.indexOf(DoubleHeadIntStack.AorB.StackB, x);
				if (n >= 0)
					System.out.println("����⿡�� " + (s.size(DoubleHeadIntStack.AorB.StackB) - (s.getCapacity() - n) + 1) +"��°�� �ֽ��ϴ�.");
				else
					System.out.println("�� �����Ͱ� �����ϴ�.");
				break;

			 case 12:													// ���ϴ�
				s.clear(DoubleHeadIntStack.AorB.StackB);
				break;

			 case 13:													// ������ ���
				System.out.println("�뷮 : " + s.getCapacity());
				System.out.println("A�� �����ͼ� : " + s.size(DoubleHeadIntStack.AorB.StackA));
				System.out.println("B�� �����ͼ� : " + s.size(DoubleHeadIntStack.AorB.StackB));
				System.out.println("A�� ��� " + (s.isEmpty(DoubleHeadIntStack.AorB.StackA) ? "�ֽ��ϴ�."
																										: "���� �ʽ��ϴ�."));
				System.out.println("B�� ��� " + (s.isEmpty(DoubleHeadIntStack.AorB.StackB) ? "�ֽ��ϴ�."
																										: "���� �ʽ��ϴ�."));
				System.out.println("���� �� " + (s.isFull() ? "�ֽ��ϴ�."
																										: "���� �ʽ��ϴ�."));
				break;
			}
		}
	}
}

