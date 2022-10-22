package AlgorithmsNDataStructuresStackNQueue;

import java.util.Scanner;

public class IntStackTesetEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		IntStack stack = new IntStack(64);
		
		while(true) {
			System.out.println();
			System.out.printf("현재 데이터 개수 : %d / %d\n", stack.size(), stack.getCapacity());
			System.out.print("(1) 푸시 (2) 팝 (3) 피크 " +
											 "(4) 덤프 (5) 검색 (6) 비움 " +
											 "(7) 출력 (0) 종료 : ");

			int menu = scan.nextInt();
			if (menu == 0) break;
			
			int x; 
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				x = scan.nextInt();
				try {
					stack.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득찼습니다.");
				}
				break;
			case 2:
				try {
					x = stack.pop();
					System.out.printf("팝한 데이터는 %d입니다.\n",x);
				}catch(IntStack.EmptyIntStackException e){
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 3:
				try {
					x = stack.peek();
					System.out.printf("피크한 데이터는 %d입니다.\n", x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				stack.dump();
				break;
			case 5: 
				System.out.print("검색할 데이터 :");
				x = scan.nextInt();
				int n = stack.indexOf(x);
				if(n >= 0) {
					System.out.printf("꼭대기에서 %d번째에 있습니다.\n", stack.size()-n);
				}else
					System.out.println("해당 데이터가 없습니다.");
				break;
			case 6:
				stack.clear();
				break;
			case 7:
				System.out.println("용량 : " + stack.getCapacity());
				System.out.println("데이터 수 :" + stack.size());
				System.out.println("비어 " + (stack.isEmpty() ? "있습니다." : "있지 않습니다."));
				System.out.println("가득" + (stack.isFull() ? "차 있습니다." : "차 있지 않습니다."));
				break;
			}
		}
	}
}
