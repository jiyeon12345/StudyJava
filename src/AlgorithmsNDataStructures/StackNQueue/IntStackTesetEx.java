package AlgorithmsNDataStructures.StackNQueue;

import java.util.Scanner;

public class IntStackTesetEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		IntStack stack = new IntStack(64);
		
		while(true) {
			System.out.println();
			System.out.printf("���� ������ ���� : %d / %d\n", stack.size(), stack.getCapacity());
			System.out.print("(1) Ǫ�� (2) �� (3) ��ũ " +
											 "(4) ���� (5) �˻� (6) ��� " +
											 "(7) ��� (0) ���� : ");

			int menu = scan.nextInt();
			if (menu == 0) break;
			
			int x; 
			switch(menu) {
			case 1:
				System.out.print("������ : ");
				x = scan.nextInt();
				try {
					stack.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("������ ����á���ϴ�.");
				}
				break;
			case 2:
				try {
					x = stack.pop();
					System.out.printf("���� �����ʹ� %d�Դϴ�.\n",x);
				}catch(IntStack.EmptyIntStackException e){
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 3:
				try {
					x = stack.peek();
					System.out.printf("��ũ�� �����ʹ� %d�Դϴ�.\n", x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 4:
				stack.dump();
				break;
			case 5: 
				System.out.print("�˻��� ������ :");
				x = scan.nextInt();
				int n = stack.indexOf(x);
				if(n >= 0) {
					System.out.printf("����⿡�� %d��°�� �ֽ��ϴ�.\n", stack.size()-n);
				}else
					System.out.println("�ش� �����Ͱ� �����ϴ�.");
				break;
			case 6:
				stack.clear();
				break;
			case 7:
				System.out.println("�뷮 : " + stack.getCapacity());
				System.out.println("������ �� :" + stack.size());
				System.out.println("��� " + (stack.isEmpty() ? "�ֽ��ϴ�." : "���� �ʽ��ϴ�."));
				System.out.println("����" + (stack.isFull() ? "�� �ֽ��ϴ�." : "�� ���� �ʽ��ϴ�."));
				break;
			}
		}
	}
}