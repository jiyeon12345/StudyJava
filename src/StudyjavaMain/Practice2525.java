package StudyjavaMain;

public class Practice2525 {
	private int time;
	private int second;
	private int ovenTime;
	private int afterOven;
	
	public Practice2525(int time, int second, int ovenTime) {
		this.time = time;
		this.second = second;
		this.ovenTime = ovenTime;
	}
	
	//내가 푼 문제 하지만 문제가 하나 있다.
	public void calcTime() {
		System.out.println("현재 시간 : " +time+ "시 " + second +"분");
		System.out.println("오븐시간 : " + ovenTime);
		
		
		afterOven = second + ovenTime;
	
		if(afterOven >= 60) {
			time++;
			afterOven -= 60;
			
			//만약 시간이 120분이 지났다면 -60만 해서 나머지 60은 계산을 하지 못한다.
			if(afterOven >= 60) {
				time++;
				afterOven -= 60;
			}
			if(time >= 24) {
				time = 0;
			}
		}
		System.out.println("현재 시간 : " +time+ "시 " + afterOven +"분");
	}
	
	//정답 : 모든 시간을 분으로 만들어서, 60분으로 나눈 값을 시간, 
	//      나머지 값을 분으로 만든다. 그리고 시간은 24를 넘으면 빼서 0로 만든다. 
	public void calcAnswer() {
		afterOven = time*60 + second + ovenTime;
		time = afterOven/60;
		second = afterOven%60;
		
		if(time >=24) {
			time -= 24;
		}
		System.out.println("현재 시간 : " +time+ "시 " + second +"분");

	}
}
