package StandardOfJava;

public class CastingTest1 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		//car.water car = fe일때 car는 fe에 대한 메소드 변수 사용이 불가능하다.
		fe2 = (FireEngine) car; //자식이 부모를 하고싶다? 근데 이렇게 되면 문제가 반드시 될텐데 아닌가? 형변환을 해서 괜챃은건가?
		fe2.water(); // fe2는 자기 엔진의 메소드를 쓰는거라 문제없음
		
	}
}
