package StandardOfJava.studyInterface;

public class Tank extends GroundUnit implements Repairable{
	public Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}
