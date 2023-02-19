package StandardOfJava.Collection;

import java.util.*;

//stack은 컬렉션 이전부터 있었다. ArrayList이전에 썼던 vector를 사용하면서 예제 확인
public class MyStack extends Vector{
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	public Object pop () {
		Object obj = peek(); // stack에 저장된 마지막 값을 가져오는 메소드
		//만약 stack이 비어있다면 익센션처리를 자동으로 처리해줌.
		removeElementAt(size()-1);
		return obj;
	}

	private Object peek() {
		int len = size();
		if(len == 0) {
			throw new EmptyStackException();
		}
		//마지막 요소를 반환
		return elementAt(len-1);
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o); //끝에서부터 객체 찾고, 반환값은 저장된 위치(배열의 index)
		
		if(i >= 0) {
			return size() - i; //stack은 맨 위에 저장된 객체의 index를 1로 정의하기 때문에 이렇게 계산해야함.
		}
		return -1;
	}
}
