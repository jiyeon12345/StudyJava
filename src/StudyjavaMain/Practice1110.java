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
			//첫번째 값의 10의 자리와 두번째 자리를 구한다.
			tenDigitA = firstNum/10; 
			oneDigitA = firstNum%10; 
			
			//첫번째 분리했던 값들을 더한다.
			secondNum = tenDigitA + oneDigitA; 
			
			oneDigitB = secondNum%10;
			
			//첫번째 일의자리 + 두번째의 일의자리를 더한다.
			firstNum = (oneDigitA*10) + oneDigitB;
			//카운트를 하나씩 더한다.
			countNum++;
			
			//만약 지정한 값(final)과 방금 더한 값(third)이 같다면 끝
			if(finalNum == firstNum) {
				System.out.println("카운트넘버 :" + countNum);
				break;
			}
		}
	}
	
	//다른 정답 => 훨씬 깔끔하네. do while이 훨씬 좋아보인다.
	//내꺼는 너무 서식이 나열되어있다면 이것은 모든것이 함축되어있다. 어느게 더 좋은 코드일까? 아무래도 짧고 함축되어있는게 더 좋은거겠지?
	// 쩝......
	public void answerSum() {
		do {
			firstNum = ((firstNum%10)*10) + //10의 자리 구하는 방법
					(((firstNum/10)+(firstNum%10))%10); //1의 자리 구하는 방법
			countNum++;
			
		}while(finalNum != firstNum);
		System.out.println("카운트넘버 :" + countNum);

	}


}
