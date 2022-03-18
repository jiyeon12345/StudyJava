package StudyjavaMain;

public class Practice2525 {
	private int time;
	private int second;
	private int ovenTime;
	private int afterOven;
	
	public Practice2525(int time, int second, int ovenTime) {
		this.time = time;
		this.second = second;
		this.ovenTime = ovenTime;
	}
	
	//���� Ǭ ���� ������ ������ �ϳ� �ִ�.
	public void calcTime() {
		System.out.println("���� �ð� : " +time+ "�� " + second +"��");
		System.out.println("����ð� : " + ovenTime);
		
		
		afterOven = second + ovenTime;

		// while�� ���鼭 0���� ũ�� ���°���. �ٵ� 0���� ������ ������. �׷� �������� �۵��� ����.
		while (afterOven > 0) {
			
			if(afterOven >= 60) {
				time++;
				afterOven -= 60;
			}else if(afterOven < 60) {
				break;
			}
		}
		
//		���� �ð��� 120���� �����ٸ� -60�� �ؼ� ������ 60�� ����� ���� ���Ѵ�.
//		�̷��� �ϳ� �� ���°� �ڵ� ����.. ����ó�� �ϸ� �������� ����ȴ�!
//		if(afterOven >= 60) {
//			time++;
//			afterOven -= 60;
//		}
//			if(afterOven >= 60) {
//				time++;
//				afterOven -= 60;

		if(time >= 24) {
			time = 0;
		}
		
		System.out.println("���� �ð� : " +time+ "�� " + afterOven +"��");
	}
	
	//���� : ��� �ð��� ������ ����, 60������ ���� ���� �ð�, 
	//      ������ ���� ������ �����. �׸��� �ð��� 24�� ������ ���� 0�� �����. 
	public void calcAnswer() {
		afterOven = time*60 + second + ovenTime;
		time = afterOven/60;
		second = afterOven%60;
		
		if(time >=24) {
			time -= 24;
		}
		System.out.println("���� �ð� : " +time+ "�� " + second +"��");

	}
}
