package AlgorithmsNDataStructuresStackNQueue;

import java.util.Scanner;

public class IntStackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		IntStack stack = new IntStack(64); //stack�� ũ�⸦ 64�� ����
		
		while(true) { 
			System.out.println(); //�޴� ������ ���� �� �� �߰�
			System.out.printf("���� ������ ����: %d / %d\n", stack.size(), stack.getCapacity());
			System.out.print("1.Ǫ�� 2.�� 3.��ũ 4.���� 0.���� :");
			
			int menu = scan.nextInt();
			if(menu == 0) break;
			
			int x = 0; 
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
			}
		}
	}

}
