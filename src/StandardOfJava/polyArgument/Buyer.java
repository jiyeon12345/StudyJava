package StandardOfJava.polyArgument;

import java.util.Vector;

public class Buyer {
	int money = 1000;
	int bonusPiont = 0;
//	Product[] item = new Product[10];
//	int i =0;
	Vector item = new Vector();
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("돈이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPiont += p.bonusPoint;
		//item[i++] = p;
		item.add(p);
		System.out.println(p+"를 구매하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입한 제품이 없습니다.");
			return;
		}
		
		for(int i = 0 ; i < item.size(); i++) {
		Product p = (Product)item.get(i);
		sum += p.price;
		itemList += (i==0) ? ""+p : ", " + p;
	}
		
		System.out.println("구입한 상품의 총 합은 "+sum+"만원, 제품 이름은" +itemList+"입니다.");
	}

	public void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPiont -= p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다.");
		}else {
			System.out.println("해당 제품을 구매하지 않았습니다.");
		}
		
	}
}
