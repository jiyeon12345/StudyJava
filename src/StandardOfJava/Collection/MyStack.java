package StandardOfJava.Collection;

import java.util.*;

//stack�� �÷��� �������� �־���. ArrayList������ ��� vector�� ����ϸ鼭 ���� Ȯ��
public class MyStack extends Vector{
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	public Object pop () {
		Object obj = peek(); // stack�� ����� ������ ���� �������� �޼ҵ�
		//���� stack�� ����ִٸ� �ͼ���ó���� �ڵ����� ó������.
		removeElementAt(size()-1);
		return obj;
	}

	private Object peek() {
		int len = size();
		if(len == 0) {
			throw new EmptyStackException();
		}
		//������ ��Ҹ� ��ȯ
		return elementAt(len-1);
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o); //���������� ��ü ã��, ��ȯ���� ����� ��ġ(�迭�� index)
		
		if(i >= 0) {
			return size() - i; //stack�� �� ���� ����� ��ü�� index�� 1�� �����ϱ� ������ �̷��� ����ؾ���.
		}
		return -1;
	}
}
