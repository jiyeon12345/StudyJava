package StandardOfJava;

public class CastingTest1 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		//car.water car = fe�϶� car�� fe�� ���� �޼ҵ� ���� ����� �Ұ����ϴ�.
		fe2 = (FireEngine) car; //�ڽ��� �θ� �ϰ�ʹ�? �ٵ� �̷��� �Ǹ� ������ �ݵ�� ���ٵ� �ƴѰ�? ����ȯ�� �ؼ� ���S���ǰ�?
		fe2.water(); // fe2�� �ڱ� ������ �޼ҵ带 ���°Ŷ� ��������
		
	}
}
