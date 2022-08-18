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
			System.out.println("���� �����մϴ�.");
			return;
		}
		money -= p.price;
		bonusPiont += p.bonusPoint;
		//item[i++] = p;
		item.add(p);
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("������ ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i = 0 ; i < item.size(); i++) {
		Product p = (Product)item.get(i);
		sum += p.price;
		itemList += (i==0) ? ""+p : ", " + p;
	}
		
		System.out.println("������ ��ǰ�� �� ���� "+sum+"����, ��ǰ �̸���" +itemList+"�Դϴ�.");
	}

	public void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPiont -= p.bonusPoint;
			System.out.println(p+"�� ��ǰ�ϼ̽��ϴ�.");
		}else {
			System.out.println("�ش� ��ǰ�� �������� �ʾҽ��ϴ�.");
		}
		
	}
}
