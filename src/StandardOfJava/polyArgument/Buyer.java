package StandardOfJava.polyArgument;

public class Buyer {
	int money = 1000;
	int bonusPiont = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("���� �����մϴ�.");
			return;
		}
		money -= p.price;
		bonusPiont += p.bonusPoint;
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
}
