package AlgorithmsNDataStructuresTwo;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��Ҽ�");
		int num = scan.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���");
		
		System.out.print("x[0]: ");
		x[0] = scan.nextInt();
		
		for(int i = 1 ; i < num ; i++) {
			do {
				System.out.printf("x[%d]:",i );
				x[i] = scan.nextInt();
			}while(x[i] < x[i-1]); //���� ��Һ��� ������ �ٽ� �� ���� 
		}//�̷��� �ϴ°� �� ȿ������ ����ΰ�? 1��° ���� �ϴ� �־���ϰ�, 2��° ������ 1��° ���� �񱳰� �����ؼ� �̷��� �۾��ѵ� �ϴ�.
		
		System.out.print("�˻��� ��:");
		int ky = scan.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		//�迭 x���� ���� ky�� ��Ҹ� �˻�
		
		if(idx < 0) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		}else
			System.out.printf("�� ���� x[%d]�� �ֽ��ϴ�.",idx);
	}
	

}
