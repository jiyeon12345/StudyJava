package StudyjavaMain;

public class Practice1110 {
	private int firstNum;
	private int tenDigitA;
	private int oneDigitA;
	private int tenDigitB;
	private int oneDigitB;
	private int secondNum;
	private int thirdNum;
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
			
			//���� ���� ���� �����ڸ���� else�� ������, 10���ڸ���� �� ������.
			if(secondNum >= 10) {
				tenDigitB = secondNum/10;
				oneDigitB = secondNum%10;
			}else {
				oneDigitB = secondNum%10;
			}
			
			//ù��° �����ڸ� + �ι�°�� �����ڸ��� ���Ѵ�.
			thirdNum = (oneDigitA*10) + oneDigitB;
			//ī��Ʈ�� �ϳ��� ���Ѵ�.
			countNum++;
			
			//���� ������ ��(final)�� ��� ���� ��(third)�� ���ٸ� ��
			if(finalNum == thirdNum) {
				System.out.println("ī��Ʈ�ѹ� :" + countNum);
				break;
			}else {
				firstNum = thirdNum;
				//�ƴ϶�� �ٽý���.
			}
		}
	}

}
