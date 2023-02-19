package StandardOfJava.Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	//스택은 마지막에 저장한 데이터를 가장 먼저 꺼내는 LIFO(last in first out)구조!
	//ArrayList와 같은 배열 기반의 컬렉션 클래스가 적합하다.
	
	//큐는 양 옆만 막혀있고 위아래로 뚫려있음. FIFO(first int first out) 구조!
	//ArrayList같은거 쓰면 배열 빈공간이 생길 수 있음 -> LinktedList 사용!
	
	public static void main(String[] args) {
		
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		//큐에 객체를 저장, return boolean
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		//스택의 맥위에 저장된 객체를 꺼낸다. 없을땐 exception발생
		System.out.println("=stack=");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		//큐에서 객체를 꺼내서 반환, 없으면 null로 반환
		System.out.println("=queue=");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

	/* 출력 값
	 =stack=
	2
	1
	0
	=queue=
	0
	1
	2
	 */
}
