package StandardOfJava;

public class DeckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);
		
		d.suffle();
		c = d.pick(0);
		System.out.println(c);
	}

}
