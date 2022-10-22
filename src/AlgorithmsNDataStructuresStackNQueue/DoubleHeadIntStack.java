package AlgorithmsNDataStructuresStackNQueue;

public class DoubleHeadIntStack {
	private int[] stk;
	private int capacity;
	private int pointA;
	private int pointB;
	
	public enum AorB { StackA, StackB };
	
	//--- 실행 시 예외 : 스택이 비어 있음 ---//
	public class EmptyDoubleHeadIntStackException extends RuntimeException {
		public EmptyDoubleHeadIntStackException() { }
	}

	//--- 실행 시 예외 : 스택이 가득 참 ---//
	public class OverflowDoubleHeadIntStackException extends RuntimeException {
		public OverflowDoubleHeadIntStackException() { }
	}
	
	public DoubleHeadIntStack(int maxlen) {
		pointA = 0; 
		pointB = maxlen-1;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		}catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public int push(AorB sw, int x) throws OverflowDoubleHeadIntStackException{
		if(pointA >= pointB +1)
			throw new OverflowDoubleHeadIntStackException();
		switch(sw) {
		case StackA:
			stk[pointA++] = x; break;
		case StackB:
			stk[pointB--] = x; break;
		}
		return x;
	}
	
	public int pop(AorB sw) throws EmptyDoubleHeadIntStackException {
		int x = 0; 
		switch(sw) {
		case StackA:
			if(pointA <=0)
				throw new EmptyDoubleHeadIntStackException();
			x = stk[--pointA];
			break;
		case StackB:
			if(pointB >= capacity-1)
				throw new EmptyDoubleHeadIntStackException();
			x = stk[++pointB];
			break;
		}
		return x;
	}
	
	public int peek(AorB sw) throws EmptyDoubleHeadIntStackException {
		int x = 0 ; 
		switch(sw) {
		case StackA :
			if(pointA <= 0) 
				throw new EmptyDoubleHeadIntStackException();
			x = stk[pointA-1]; //-1을 하는 이유는 push할때 값을 +1해놨기 때문
			break;
		case StackB:
			if(pointB >= capacity-1)
				throw new EmptyDoubleHeadIntStackException(); // 스택 b가 비어있음. pointB는 마지막 값부터 시작되니까 capacity보다 값이 많거나 같다면 그냥 없는거랑 동일하다는 뜻
			x = stk[pointB +1]; //+1을 하는 이유 push할때 값을 -1해놨기 때문. 자체 값을 더하는 것이 아니기 때문에 -1만 한다.
			break;
		}
		return x;
	}
	
	public int indexOf(AorB sw, int x) {
		switch(sw) {
		case StackA:
			for(int i = pointA -1; i >= 0; i--) 
				if(stk[i] == x)
					return i;
			break;
		case StackB:
			for(int i = pointB +1; i < capacity; i++)
				if(stk[i] == x)
					return i;
			break;
		}
		return -1;
	}
	
	public void clear(AorB sw) {
		switch(sw) {
		case StackA : pointA =0; break;
		case StackB : pointB = capacity-1; break;
		}
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int size(AorB sw) {
		switch(sw) {
		case StackA:
			return pointA;
		case StackB:
			return capacity - pointB-1;
		}
		return 0;
	}
	
	public boolean isEmpty(AorB sw) {
		switch(sw) {
		case StackA:
			return pointA <= 0;
		case StackB:
			return pointB >= capacity-1;
		}
		return true;
	}
	
	public boolean isFull() {
		return pointA >= pointB+1;
	}
	
	public void dump(AorB sw) {
		switch (sw) {
		 case StackA:
			if (pointA <= 0)
				System.out.println("스택이 비어 있습니다.");
			else {
				for (int i = 0; i < pointA; i++)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		 case StackB:
			if (pointB >= capacity - 1)
				System.out.println("스택이 비어 있습니다.");
			else {
				for (int i = capacity - 1; i > pointB; i--)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		}
	}
}
