package StandardOfJava.studyInterface;

public class Dropship extends AirUnit implements Repairable{
	public Dropship() {
		super(140);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}
