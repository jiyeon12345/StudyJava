package StudyjavaMain;

import java.util.Arrays;

public class ReverseArrayPrac1 {

	
	public static void main(String[] args) {
		// arr정보를 역순으로 출력하기
		int [] arr = {2,5,1,3,9,6,7};
		System.out.println(Arrays.toString(arr));
		
		//findReverse(arr);
		//sumOf(arr);
		
		int [] arr2 = new int[arr.length];
		//copy(arr, arr2);
		rcopy(arr, arr2);
		
	}

	private static void rcopy(int[] arr, int[] arr2) {
		// TODO Auto-generated method stub
		for(int i=0 ; i < arr.length ; i++) {
			arr2[i] = arr[arr.length-1-i];
		}
		System.out.println("arr2 : " +Arrays.toString(arr2));
	}

	private static void copy(int[] arr, int[] arr2) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		System.out.println("arr2 : " +Arrays.toString(arr2));
	}

	private static void findReverse(int[] arr) {
		// reverse메소드로 가기위한 중간 단계, main에서 쓰니 길어져서 빼놓음
		for(int i = 0; i < arr.length/2; i ++) {
			System.out.printf("a[%d]과 a[%d]을 교환합니다.\n", i, arr.length-i-1);
			reserve(arr, i, arr.length-i-1);
		}
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}

	private static void sumOf(int[] arr) {
		// 총 합계 구하기
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.printf("총 합은 %d 입니다.\n", sum);
	}

	private static void reserve(int[] arr, int i, int j) {
		// 맨 앞 + 맨 뒤 값을 순차적으로 바꿈 
		int num = arr[i];
		arr[i] = arr[j];
		arr[j] = num;
		
		System.out.println(Arrays.toString(arr));
	}

}
