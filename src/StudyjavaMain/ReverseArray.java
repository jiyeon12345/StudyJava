package StudyjavaMain;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i=0; i < a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("소수 : ");
		int num = scan.nextInt();
		
		int[] x = new int [num];
		
		for(int i=0; i < num; i++) {
			System.out.printf("x[%d]:",i);
			x[i] = scan.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬");
		System.out.println("x="+Arrays.toString(x));
	}

}
