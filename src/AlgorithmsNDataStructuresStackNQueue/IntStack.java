package AlgorithmsNDataStructuresStackNQueue;

public class IntStack {
	private int[] stk;  //push�� �����͸� �����ϴ� ���ÿ� �迭, 0 �� ������ �ٴ��̴�.
	private int capacity; // ������ �뷮, �ִ� ���� �� �ִ� ������ ��
	private int ptr; // ���� ������ : ���ÿ� �׿��ִ� ������ ���� ��Ÿ��. ���ÿ� �ƹ��͵� ������0, �������� capacity���� �ȴ�.
	
	//���� �� ���� : ������ ����ִ�
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	//���� �� ���� : ������ ������
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	//���� �� ���� EmptyIntStackException & OverflowIntStackException�� push, pop, peek �޼ҵ忡�� ���ȴ�.
	
	//������ : ���ÿ� �迭 ��ü�� �����ϴ� ���� �غ� �۾�. 
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity]; //���� ��ü�� �迭�� ����
		}catch(OutOfMemoryError e) { //���� �Ұ����Ҷ��� ����
			capacity = 0;
		}
	}
	
	//���ÿ� x�� Ǫ���ϴ� �޼ҵ� : ������ �������� Ǫ���� �� ���� ��� OverflowIntStackException���� ������.
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	

	//pop �޼ҵ� : �����͸� �����ϰ� �� ��ȯ�ϴ� �޼���. ������ ������� ���� OverflowIntStackException���� ������. 
	public int pop() throws EmptyIntStackException{
		if(ptr <=0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	//������ �� �����(������)���� Ȯ���� �� �ִ� �޼ҵ�
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0) 
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	//���ÿ� �׿��ִ� ��� �����͸� �ѹ��� �����ϴ� �޼ҵ�. 
	//���ÿ��� push, pop�ϴ� ��� �۾��� ���������͸� �������� �̷������. 
	//���� ��� ��Ҹ� �����ϰ��� �Ѵٸ� ptr�� 0���θ� ���� ���!
	public void clear() {
		ptr = 0;
	}

	//���ÿ��� x�� ã�� �ε����� ��ȯ
	//�������� �ٴ������� ��ĵ�ϴ� ���� : '���� ���̵Ǵ� ������'�� ã�� ���ؼ�!
	//���� [2] = 20; [4]= 20; �̶��? [4]��° ���� ��� �� ����.
	public int indexOf(int x) {
		for(int i = ptr-1; i >= 0; i--)  // �������� 0���� �����˻�
			if(stk[i] == x)
				return i; //�˻� ����
			return -1;  //�˻� ����
	}
	public int getCapacity(){
		return capacity;
	}
	
	//���ÿ� �׿��ִ� ������ ������ ��ȯ
	public int size() {
		return ptr;
	}
	
	//������ ��� �ִ°�?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	//������ ����á����
	public boolean isFull() {
		return ptr >= capacity;
	}
	
	//���� ���� ��� �����͸� �ٴ� -> ����� ������ ���
	public void dump() {
		if(ptr <= 0) {
			System.out.println("������ ����ֽ��ϴ�.");
		}else {
			for(int i = 0 ; i < ptr ; i++) {
				System.out.print(stk[i] +" ");
			}
			System.out.println();
		}
	}
	
	
}

/*
 * å ��, if(ptr == 0) �� ������ �� ����. 
 * ������ ���� ���α׷� ���� ������ ���� -1�� �Է����� ����? �̷� ���ɼ��� �����Ͽ� 
 * ���� ��ü ������ ��� �����ϴ� �͵��� ������ �� �ִ�. �ȼ��� ���! 
 */
