package StudyjavaMain;

public class Practice1110 {
	private int firstNum;
	private int tenDigitA;
	private int oneDigitA;
	private int oneDigitB;
	private int secondNum;
	private int countNum;
	private int finalNum;
	
	public Practice1110 (int firstNum){
		this.firstNum = firstNum;
		this.finalNum = firstNum;
		countNum = 0;
	}
	
	public void calcSum() {
		while(true) {
			//ù��° ���� 10�� �ڸ��� �ι�° �ڸ��� ���Ѵ�.
			tenDigitA = firstNum/10; 
			oneDigitA = firstNum%10; 
			
			//ù��° �и��ߴ� ������ ���Ѵ�.
			secondNum = tenDigitA + oneDigitA; 
			
			oneDigitB = secondNum%10;
			
			//ù��° �����ڸ� + �ι�°�� �����ڸ��� ���Ѵ�.
			firstNum = (oneDigitA*10) + oneDigitB;
			//ī��Ʈ�� �ϳ��� ���Ѵ�.
			countNum++;
			
			//���� ������ ��(final)�� ��� ���� ��(third)�� ���ٸ� ��
			if(finalNum == firstNum) {
				System.out.println("ī��Ʈ�ѹ� :" + countNum);
				break;
			}
		}
	}
	
	//�ٸ� ���� => �ξ� ����ϳ�. do while�� �ξ� ���ƺ��δ�.
	//������ �ʹ� ������ �����Ǿ��ִٸ� �̰��� ������ ����Ǿ��ִ�. ����� �� ���� �ڵ��ϱ�? �ƹ����� ª�� ����Ǿ��ִ°� �� �����Ű���?
	// ��......
	public void answerSum() {
		do {
			firstNum = ((firstNum%10)*10) + //10�� �ڸ� ���ϴ� ���
					(((firstNum/10)+(firstNum%10))%10); //1�� �ڸ� ���ϴ� ���
			countNum++;
			
		}while(finalNum != firstNum);
		System.out.println("ī��Ʈ�ѹ� :" + countNum);

	}


}
