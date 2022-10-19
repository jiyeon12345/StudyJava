package AlgorithmsNDataStructuresTwo;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("욧소수");
		int num = scan.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.print("x[0]: ");
		x[0] = scan.nextInt();
		
		for(int i = 1 ; i < num ; i++) {
			do {
				System.out.printf("x[%d]:",i );
				x[i] = scan.nextInt();
			}while(x[i] < x[i-1]); //앞의 요소보다 작으면 다시 값 적기 
		}//이렇게 하는게 더 효율적인 방법인가? 1번째 값은 일단 넣어야하고, 2번째 값부터 1번째 값과 비교가 가능해서 이렇게 작업한듯 하다.
		
		System.out.print("검색할 값:");
		int ky = scan.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		//배열 x에서 값이 ky인 요소를 검색
		
		if(idx < 0) {
			System.out.println("그 값의 요소가 없습니다.");
		}else
			System.out.printf("그 값은 x[%d]에 있습니다.",idx);
	}
	

}
