package StandardOfJava.Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	//������ �������� ������ �����͸� ���� ���� ������ LIFO(last in first out)����!
	//ArrayList�� ���� �迭 ����� �÷��� Ŭ������ �����ϴ�.
	
	//ť�� �� ���� �����ְ� ���Ʒ��� �շ�����. FIFO(first int first out) ����!
	//ArrayList������ ���� �迭 ������� ���� �� ���� -> LinktedList ���!
	
	public static void main(String[] args) {
		
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		//ť�� ��ü�� ����, return boolean
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		//������ ������ ����� ��ü�� ������. ������ exception�߻�
		System.out.println("=stack=");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		//ť���� ��ü�� ������ ��ȯ, ������ null�� ��ȯ
		System.out.println("=queue=");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

	/* ��� ��
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
