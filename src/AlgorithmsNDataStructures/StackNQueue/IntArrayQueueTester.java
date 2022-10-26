package AlgorithmsNDataStructures.StackNQueue;

//����4-4
//int�� ���� ���� ť(�� ���۸� ������� �ʰ� ����)�� ��� ��

import java.util.Scanner;

class IntArrayQueueTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntArrayQueue s = new IntArrayQueue(64);		// �ִ� 64���� Ǫ���� �� �ִ� ť

		while (true) {
			System.out.println("���� ������ ���� : " + s.size() + " / "
															+ s.capacity());
			System.out.print("(1) ��ť��(2) ��ť��(3) ��ũ��" +
											 "(4) ������(0) ���� : ");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			int x = 0;
			switch (menu) {
			 case 1:													//  ��ť
				System.out.print("������ : ");
				x = stdIn.nextInt();
				try {
					s.enque(x);
				 } catch (IntArrayQueue.OverflowIntArrayQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;

			 case 2:													//  ��ť
				try {
					 x = s.deque();
					System.out.println(" ��ť�� �����ʹ� " + x + "�Դϴ�.");
				 } catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;

			 case 3:													// ��ũ
				try {
					 x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				 } catch (IntArrayQueue.EmptyIntArrayQueueException e) {
					System.out.println("ť�� ��� �ֽ��ϴ�.");
				}
				break;

			 case 4:													// ����
				s.dump();
				break;
			}
		}
	}
}

