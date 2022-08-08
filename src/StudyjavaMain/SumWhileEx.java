package StudyjavaMain;

import java.util.Scanner;

class SumWhileEx {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합.");
 		System.out.print("n : ");
		int n = stdIn.nextInt();

		int sum = 0;				// 珥앺빀
		int i = 1;

		while (i <= n) {		// i媛� n�씠�븯�씠硫� 諛섎났
			sum += i;					// sum�뿉 i瑜� �뜑�빀�땲�떎
			i++;							// i�쓽 媛믪쓣 1 利앷�
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.println("i의 값은 " + i + "입니다.");
	}
}
