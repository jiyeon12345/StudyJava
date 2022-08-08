package StudyjavaMain;

import java.util.Scanner;

class Min3 {

	static int min3(int a, int b, int c) {
		int min = a;						// 理쒖넖媛�
		if (b < min) min = b;
		if (c < min) min = c;

		return min;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a, b, c;

		System.out.println("�꽭 �젙�닔�쓽 理쒖넖媛믪쓣 援ы빀�땲�떎.");
		System.out.print("a�쓽 媛� : ");  a = stdIn.nextInt();
		System.out.print("b�쓽 媛� : ");  b = stdIn.nextInt();
		System.out.print("c�쓽 媛� : ");  c = stdIn.nextInt();

		int min = min3(a, b, c);	// a, b, c�쓽 理쒖넖媛�

		System.out.println("理쒖넖媛믪� " + min + "�엯�땲�떎.");
	}
}
