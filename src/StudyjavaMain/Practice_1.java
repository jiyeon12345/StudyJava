package StudyjavaMain;

public class Practice_1 {
	int sum=0;
	public Practice_1() {
		for(int i=0 ; i< 6 ; i++) {
			int rand = (int) (Math.random()*6)+1;
			sum += rand;
			System.out.println(i+"¹øÂ° :" +rand+", sum = "+sum);

		}
	}
}
