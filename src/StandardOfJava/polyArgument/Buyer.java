package StandardOfJava.polyArgument;

public class Buyer {
	int money = 1000;
	int bonusPiont = 0;
	Product[] item = new Product[10];
	int i =0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("돈이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPiont += p.bonusPoint;
		item[i++] = p;
		System.out.println(p+"를 구매하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0 ; i < item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] +",";
		}
		
		System.out.println("구입한 상품의 총 합은 "+sum+"만원, 제품 이름은" +itemList+"입니다.");
	}
}
