package AlgorithmsNDataStructures.StackNQueue;

import java.util.Scanner;

public class IntStackTestExGenericsVer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StackGenerics<String> s = new StackGenerics(64);
		
		while(true) {
			System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1) 푸시 (2) 팝 (3) 피크 " +
											 "(4) 덤프 (5) 검색 (6) 비움 " +
											 "(7) 출력 (0) 종료 : ");

			int menu = scan.nextInt();
			if (menu == 0) break;

			String x;
		}
		
	}

}
