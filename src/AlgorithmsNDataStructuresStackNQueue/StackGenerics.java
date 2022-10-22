package AlgorithmsNDataStructuresStackNQueue;

public class StackGenerics<E> {
	private E[] stk;
	private int capacity;
	private int ptr;
	
	public static class EmptyGstackException extends RuntimeException{
		public EmptyGstackException() {}
	}
	
	public static class OverflowGStackException extends RuntimeException{
		public OverflowGStackException() {}
	}
	
	public StackGenerics(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = (E[]) new Object[capacity]; // 스택 본체용 배열을 생성
		}catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public E push(E x) throws OverflowGStackException {
		if (ptr >= capacity)								// 스택이 가득 참
			throw new OverflowGStackException();
		return stk[ptr++] = x;
	}
	
	public E pop() throws EmptyGstackException {
		if(ptr <=0) {
			throw new EmptyGstackException();
		}
		return stk[--ptr];
	}
	
	public E peek() throws EmptyGstackException{
		if(ptr <=0)
			throw new EmptyGstackException();
		return stk[ptr-1];
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int indexOf(E x) {
		for(int i = ptr-1 ; i >=0 ; i++) 
			if(stk[i].equals(x)) 
				return i;
		return -1; //어차피 위의 if문에서 return을 하면 for문이 끝나는거라 for문 끝난 뒤에 -1을 하는것이 더 맞다.
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	public boolean isFull() {
		return ptr >= capacity;
	}
	
	public void dump() {
		for(int i = 0 ; i < ptr; i++) {
			System.out.print(stk[i]+ " ");
		}
		System.out.println();
	}
	
}
