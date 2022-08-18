package StandardOfJava.polyArgument;

public class Buyer {
	int money = 1000;
	int bonusPiont = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("돈이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPiont += p.bonusPoint;
		System.out.println(p+"를 구매하셨습니다.");
	}
}
