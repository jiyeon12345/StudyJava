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
			//첫번째 값의 10의 자리와 두번째 자리를 구한다.
			tenDigitA = firstNum/10; 
			oneDigitA = firstNum%10; 
			
			//첫번째 분리했던 값들을 더한다.
			secondNum = tenDigitA + oneDigitA; 
			
			//만약 더한 값이 일의자리라면 else로 빠지고, 10의자리라면 또 나눈다.
			if(secondNum >= 10) {
				tenDigitB = secondNum/10;
				oneDigitB = secondNum%10;
			}else {
				oneDigitB = secondNum%10;
			}
			
			//첫번째 일의자리 + 두번째의 일의자리를 더한다.
			thirdNum = (oneDigitA*10) + oneDigitB;
			//카운트를 하나씩 더한다.
			countNum++;
			
			//만약 지정한 값(final)과 방금 더한 값(third)이 같다면 끝
			if(finalNum == thirdNum) {
				System.out.println("카운트넘버 :" + countNum);
				break;
			}else {
				firstNum = thirdNum;
				//아니라면 다시시작.
			}
		}
	}

}
