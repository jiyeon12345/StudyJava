package AlgorithmsNDataStructuresRecursive;

import java.util.Scanner;

//3. �迭 a�� ��� ����� �ִ� ������� ���ϴ� �޼��带 �ۼ��Ͻÿ�
public class GCDArray {
	
	static int gcd(int x, int y) {
		while(y != 0) {
			int temp = y;
			y = x%y;
			x = temp;
		}
		return x;
	}
	
	static int gcdArray(int a[], int start, int no) {
		if(no == 1)
			return a[start];
		else if(no == 2)
			return gcd(a[start], a[start+1]);
		else
			return gcd(a[start], gcdArray(a,start+1, no-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("� ������ �ִ� ������� ���Ұ��ΰ�? :");
		int num;
		do {
			num  = scan.nextInt();
		}while(num <=1 );
		
		int[] x = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			System.out.printf("x[%d] :", i);
			x[i] = scan.nextInt();
		}
		
		System.out.printf("�ִ� ������� %d�Դϴ�.", gcdArray(x,0,num));
	}

}
