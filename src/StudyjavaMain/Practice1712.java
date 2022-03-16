package StudyjavaMain;

public class Practice1712 {
	private int fixed;
	private int notfixed;
	private int chargeItem;
	private int componyCharge;
	private int consumerCharge;
	private int computerCount;
	
	public Practice1712(int fixed, int notfixed, int chargeItem) {
		this.fixed = fixed;
		this.notfixed = notfixed;
		this.chargeItem = chargeItem;
	}
	
	public void calcComputer() {
		
		if(chargeItem <= notfixed) {
			System.out.println(-1);
		}else {
			computerCount = (fixed / (chargeItem-notfixed))+1;
			System.out.println(computerCount);
		}
		
	}
}
