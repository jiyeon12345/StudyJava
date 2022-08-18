package StandardOfJava.polyArgument;

public class PolyArgumentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}

}
