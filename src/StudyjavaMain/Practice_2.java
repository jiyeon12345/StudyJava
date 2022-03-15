package StudyjavaMain;

public class Practice_2 {
	private int bigSalt;
	private int sSalt;
	private int request;
	private int cal5;
	private int extra5;
	private int cal3;
	private int extra3;
	private int totalSum;


	public Practice_2(int request) {
		this.request = request;
		bigSalt = 5;
		sSalt = 3;
	}
	
	public void calcSalt() {
		while(true) {
			cal5 = request / bigSalt;
			extra5 = request % bigSalt;
			
			if(cal5 <=0) {
				System.out.println(-1);
				break;
			}
			if(!(extra5 == 0)) {
				cal3 = extra5 / sSalt;
				extra3 = extra5 % sSalt;
				if(extra3 > 0) {
					cal3 ++;
				}
			}
			
			totalSum = cal5+cal3;
			
			System.out.println("salt5 : " +cal5 + ", salt3 :" +cal3 +", sum = "+totalSum);
			break;
		}
	}
}
