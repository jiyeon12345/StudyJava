package AlgorithmsNDataStructuresRecursive;

import java.util.Scanner;

//3. 배열 a의 모든 요소의 최대 공약수를 구하는 메서드를 작성하시오
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
		System.out.print("몇개 정수의 최대 공약수를 구할것인가? :");
		int num;
		do {
			num  = scan.nextInt();
		}while(num <=1 );
		
		int[] x = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			System.out.printf("x[%d] :", i);
			x[i] = scan.nextInt();
		}
		
		System.out.printf("최대 공약수는 %d입니다.", gcdArray(x,0,num));
	}

}
