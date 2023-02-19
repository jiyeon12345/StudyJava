package StandardOfJava.Collection;

import java.util.*;

public class stackEx1 {
	//���� Ȱ�� �� : ���İ��. ���İ�ȣ �˻�, ���� undo/redo, �������� �ڷ� ������
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		goUrl("1.NATE");
		goUrl("2.YAHOO");
		goUrl("3.NAVER");
		
		printStatus();
		
		goBack();
		System.out.println("click back button");
		printStatus();
		
		goBack();
		System.out.println("click back button");
		printStatus();
		
		goForward();
		System.out.println("click forward button");
		printStatus();
		
		goUrl("4.DAUM");
		System.out.println("click new button");
		printStatus();

	}

	private static void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}

	private static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}

	private static void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("now is  " + back.peek());
		System.out.println();
	}

	private static void goUrl(String url) {
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
			
		}
	}

}
