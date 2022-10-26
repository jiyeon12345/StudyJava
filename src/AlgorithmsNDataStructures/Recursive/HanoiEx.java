package AlgorithmsNDataStructures.Recursive;

import java.util.Scanner;

public class HanoiEx {

	static String[] name = {"A���","B���","C���"};
	
	static void move(int no, int x, int y) {
		if(no > 1) {
			move (no-1, x, 6-x-y);
		}
		System.out.println("����[" + no + "]�� " + name[x - 1] + "���� " + name[y - 1] + "���� �̵�");
		
		if(no > 1) {
			move(no-1, 6-x-y, y);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�ϳ����� ž");
		System.out.print("������ ���� : ");
		int n = stdIn.nextInt();

		move(n, 1, 3);   // ��1��տ� ���� n ���� ��3������� �̵�
	}

}