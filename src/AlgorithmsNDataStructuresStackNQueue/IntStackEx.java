package AlgorithmsNDataStructuresStackNQueue;

import java.util.Scanner;

public class IntStackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		IntStack stack = new IntStack(64); //stack의 크기를 64로 정의
		
		while(true) { 
			System.out.println(); //메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", stack.size(), stack.getCapacity());
			System.out.print("1.푸시 2.팝 3.피크 4.덤프 0.종료 :");
			
			int menu = scan.nextInt();
			if(menu == 0) break;
			
			int x = 0; 
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
			}
		}
	}

}
