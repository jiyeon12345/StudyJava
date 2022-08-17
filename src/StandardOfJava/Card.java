package StandardOfJava;

public class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPACE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int num;
	
	Card(){
		this(SPACE,1);
	}
	
	Card(int kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER","HEART","DIAMOND","SPACE"};
		String numbers = "0123456789XJQK";
		return "kind: " + kinds[this.kind]+", number :" + numbers.charAt(this.num);
	}
}
