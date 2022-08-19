package StandardOfJava.studyInnerClass;

public class InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	
	//인스턴스 멤버 간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner();
	//static멤버 간에는 서로 직접 접근이 가능하다.
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//static 멤버는 인스턴스 멤버에 직접 접근할 수 없다.
		//InstanceInner obj1 = new InstanceInner();
		//같은 static은 사용이 가능하다.
		StaticInner obj2 = new StaticInner();
		
		//static에서 인스턴스 클래스를 쓰고 싶다면, 외부 class를 객체 생성 후 거기안에 있는 인스턴스 클래스를 써야한다.
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		//인스턴스 메소드에서는 인스턴스 클래스 & static 클래스 모두 접근이 가능하다.
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}
	
	void myMethod() {
		//메소드 안에서도 클래스를 만들 수 있다.
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
	
}
