package StandardOfJava.polyArgument;

public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		System.out.println("���� ���� ����" +b.money+", ���ʽ�����Ʈ�� :"+b.bonusPiont+"�Դϴ�.");
		b.buy(new Computer());
		System.out.println("���� ���� ����" +b.money+", ���ʽ�����Ʈ�� :"+b.bonusPiont+"�Դϴ�.");

		
	}

}
