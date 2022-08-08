package StudyjavaMain;

import java.util.Scanner;

class DigitsNo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�뼇�쓽 �젙�닽媛믪쓽 �옄由우닔瑜� 援ы빀�땲�떎.");

		int n;
		do {
			System.out.print("�젙�닽媛� : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		int no = 0;         // �옄由우닔
		while (n > 0) {
			n /= 10;         // n�쓣 10�쑝濡� �굹�닏�땲�떎
			no++;
		}

		System.out.println("洹� �닔�뒗 " + no + "�옄由ъ엯�땲�떎.");
	}
}
