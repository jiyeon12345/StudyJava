package StandardOfJava.polyArgument;

public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		System.out.println("현재 남은 돈은" +b.money+", 보너스포인트는 :"+b.bonusPiont+"입니다.");
		b.buy(new Computer());
		System.out.println("현재 남은 돈은" +b.money+", 보너스포인트는 :"+b.bonusPiont+"입니다.");

		
	}

}
