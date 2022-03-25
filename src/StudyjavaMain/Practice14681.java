package StudyjavaMain;

public class Practice14681 {
	private int x;
	private int y;
	

	public Practice14681(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void calcQuadrant() {
		if(x < 0 && y > 0) {
			System.out.println(2);
		}else if(x > 0 && y > 0) {
			System.out.println(1);
		}else if(x < 0 && y < 0) {
			System.out.println(3);
		}else if(x > 0 && y < 0) {
			System.out.println(4);
		}
	}
}
