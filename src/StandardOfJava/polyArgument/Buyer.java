package StandardOfJava.polyArgument;

public class Buyer {
	int money = 1000;
	int bonusPiont = 0;
	Product[] item = new Product[10];
	int i =0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("���� �����մϴ�.");
			return;
		}
		money -= p.price;
		bonusPiont += p.bonusPoint;
		item[i++] = p;
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0 ; i < item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] +",";
		}
		
		System.out.println("������ ��ǰ�� �� ���� "+sum+"����, ��ǰ �̸���" +itemList+"�Դϴ�.");
	}
}
