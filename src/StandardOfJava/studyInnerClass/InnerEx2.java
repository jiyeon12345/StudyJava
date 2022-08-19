package StandardOfJava.studyInnerClass;

public class InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	
	//�ν��Ͻ� ��� ������ ���� ���� ������ �����ϴ�.
	InstanceInner iv = new InstanceInner();
	//static��� ������ ���� ���� ������ �����ϴ�.
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//static ����� �ν��Ͻ� ����� ���� ������ �� ����.
		//InstanceInner obj1 = new InstanceInner();
		//���� static�� ����� �����ϴ�.
		StaticInner obj2 = new StaticInner();
		
		//static���� �ν��Ͻ� Ŭ������ ���� �ʹٸ�, �ܺ� class�� ��ü ���� �� �ű�ȿ� �ִ� �ν��Ͻ� Ŭ������ ����Ѵ�.
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		//�ν��Ͻ� �޼ҵ忡���� �ν��Ͻ� Ŭ���� & static Ŭ���� ��� ������ �����ϴ�.
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}
	
	void myMethod() {
		//�޼ҵ� �ȿ����� Ŭ������ ���� �� �ִ�.
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
	
}
