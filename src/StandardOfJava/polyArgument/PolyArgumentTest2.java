package StandardOfJava.polyArgument;

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.summary();
	}

}
