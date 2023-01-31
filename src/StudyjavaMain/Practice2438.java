package StudyjavaMain;

import java.util.Scanner;

public class Practice2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("±âº» º°Âï±â");
		for(int i = 0; i <= num ; i ++) {
			for(int j = 0; j < i ; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("°Å²Ù·Î º°Âï±â");
		for(int i = num ; i >= 0 ; i--) {
			for(int j = i; j >= 0 ; j --) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("»ï°¢Çü º°Âï±â");
		for(int i = 1 ; i < num ; i++) {
			for(int j = num-i; j >= 0 ; j --) {
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
				//test
			}
			
			System.out.println();
		}
	}

}
