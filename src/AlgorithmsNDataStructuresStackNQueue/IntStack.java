package AlgorithmsNDataStructuresStackNQueue;

public class IntStack {
	private int[] stk;  //push된 데이터를 저장하는 스택용 배열, 0 이 스택의 바닥이다.
	private int capacity; // 스택의 용량, 최대 쌓을 수 있는 데이터 수
	private int ptr; // 스택 포인터 : 스택에 쌓여있는 데이터 수를 나타냄. 스택에 아무것도 없으면0, 가득차면 capacity값이 된다.
	
	//실행 시 예외 : 스택이 비어있다
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	//실행 시 예외 : 스택이 가득참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	//실행 시 예외 EmptyIntStackException & OverflowIntStackException은 push, pop, peek 메소드에서 사용된다.
	
	//생성자 : 스택용 배열 본체를 생성하는 등의 준비 작업. 
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity]; //스택 본체용 배열을 생성
		}catch(OutOfMemoryError e) { //생성 불가능할때의 예외
			capacity = 0;
		}
	}
	
	//스택에 x를 푸쉬하는 메소드 : 스택이 가득차서 푸쉬할 수 없는 경우 OverflowIntStackException으로 보낸다.
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	

	//pop 메소드 : 데이터를 제거하고 값 반환하는 메서드. 스택이 비어있을 때는 OverflowIntStackException으로 보낸다. 
	public int pop() throws EmptyIntStackException{
		if(ptr <=0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	//스택의 맨 꼭대기(마지막)값을 확인할 수 있는 메소드
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0) 
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	//스택에 쌓여있는 모든 데이터를 한번에 삭제하는 메소드. 
	//스택에서 push, pop하는 모든 작업은 스택포인터를 바탕으로 이루어진다. 
	//따라서 모든 요소를 삭제하고자 한다면 ptr을 0으로만 만들어도 충분!
	public void clear() {
		ptr = 0;
	}

	//스택에서 x를 찾아 인덱스를 변환
	//꼭대기부터 바닥쪽으로 스캔하는 이유 : '먼저 팝이되는 데이터'를 찾기 위해서!
	//만약 [2] = 20; [4]= 20; 이라면? [4]번째 값을 출력 할 것임.
	public int indexOf(int x) {
		for(int i = ptr-1; i >= 0; i--)  // 꼭대기부터 0까지 선형검색
			if(stk[i] == x)
				return i; //검색 성공
			return -1;  //검색 실패
	}
	public int getCapacity(){
		return capacity;
	}
	
	//스택에 쌓여있는 데이터 갯수를 반환
	public int size() {
		return ptr;
	}
	
	//스택이 비어 있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	//스택이 가득찼는지
	public boolean isFull() {
		return ptr >= capacity;
	}
	
	//스택 안의 모든 데이터를 바닥 -> 꼭대기 순으로 출력
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어있습니다.");
		}else {
			for(int i = 0 ; i < ptr ; i++) {
				System.out.print(stk[i] +" ");
			}
			System.out.println();
		}
	}
	
	
}

/*
 * 책 왈, if(ptr == 0) 도 가능할 수 있음. 
 * 하지만 만약 프로그램 오류 등으로 인해 -1을 입력했을 경우는? 이런 가능성을 생각하여 
 * 스택 본체 범위를 벗어나 접근하는 것들을 방지할 수 있다. 안성성 향상! 
 */
