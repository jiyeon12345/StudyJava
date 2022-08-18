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
//fireEngine이 car를 extends하고 있기 때문에 instanceof Car를 하게 되면 true가 된다!! 참고하기.
}
