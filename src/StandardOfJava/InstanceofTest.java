package StandardOfJava;

public class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("this is a fireEngine instance.");
		}
		
		if(fe instanceof Car) {
			System.out.println("this is a car instance");
		}
		
		if(fe instanceof Object) {
			System.out.println("this is an Object insstance");
		}
		
		System.out.println(fe.getClass().getName());
	}
//fireEngine�� car�� extends�ϰ� �ֱ� ������ instanceof Car�� �ϰ� �Ǹ� true�� �ȴ�!! �����ϱ�.
}
