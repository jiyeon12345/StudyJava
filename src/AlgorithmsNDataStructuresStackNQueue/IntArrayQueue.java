package AlgorithmsNDataStructuresStackNQueue;

//����4-4
//int�� ���� ���� ť(�� ���۸� ������� �ʰ� ����)

public class IntArrayQueue {
	private int [] que;			// ť�� ��ü
	private int capacity;		// ť�� �뷮
	private int num;				// ���� ������ ����

	//--- ���� �� ���� : ť�� ��� ���� ---//
	public class EmptyIntArrayQueueException extends RuntimeException {
		public EmptyIntArrayQueueException() { }
	}

	//--- ���� �� ���� : ť�� ���� �� ---//
	public class OverflowIntArrayQueueException extends RuntimeException {
		public OverflowIntArrayQueueException() { }
	}


	//--- ������ ---//
	public IntArrayQueue(int maxlen) {
		num = 0;
		capacity = maxlen;
		try {
			que = new int[capacity];			// ť ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) {		// ������ �� ����
			capacity = 0;
		}
	}

	//--- ť�� �����͸�  ��ť ---//
	public int enque(int x) throws OverflowIntArrayQueueException {
		if (num >= capacity)
			throw new OverflowIntArrayQueueException();			// ť�� ���� ��
		que[num++] = x;
		return x;
	}

	//--- ť���� �����͸�  ��ť ---//
	public int deque() throws EmptyIntArrayQueueException {
		if (num <= 0)
			throw new EmptyIntArrayQueueException();				// ť�� ��� ����
		int x = que[0];
		for (int i = 0; i < num - 1; i++)
			que[i] = que[i + 1];
		num--;
		return x;
	}

	//--- ť���� �����͸� ��ũ(�Ǿ� �����͸� �鿩�ٺ� ) ---*/
	public int peek() throws EmptyIntArrayQueueException {
		if (num <= 0)
			throw new EmptyIntArrayQueueException();			// ť�� ��� ����
		return que[num - 1];
	}

	//--- ť���� x�� �˻��Ͽ� �ε���(�߰����� ���ϸ� -1)�� ��ȯ�մϴ�---//
	public int indexOf(int x) {
		for (int i = 0; i < num; i++)
			if (que[i]  == x)					// �˻� ����
				return i;
		return -1;									// �˻� ����
	}

	//--- ť�� ���ϴ� ---//
	public void clear() {
		num = 0;
	}

	//--- ť�� �뷮�� ��ȯ�մϴ� ---//
	public int capacity() {
		return capacity;
	}

	//--- ť�� �׿��ִ� �����ͼ��� ��ȯ�մϴ� ---//
	public int size() {
		return num;
	}

	//--- ť�� ��� �ִ°�? ---//
	public boolean isEmpty() {
		return num <= 0;
	}

	//--- ť�� ���� á�°�? ---//
	public boolean isFull() {
		return num >= capacity;
	}

	//--- ť ���� ��� �����͸� �Ǿ� �� �ǳ��� ������ ��� ---//
	public void dump() {
		if (num <= 0)
			System.out.println("ť�� ��� �ֽ��ϴ�.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}
	}
}


