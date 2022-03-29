package StudyjavaMain;

public class Practice10872 {
	private int countNum;
	private int answerNum;
	
	public Practice10872(int countNum) {
		this.countNum = countNum;
		answerNum =1;
	}
	
	public void calcFactorial() {
		for(int i=1 ; i <= countNum; i++) {
			answerNum *= i;
		}
		System.out.println(answerNum);
	}

}
