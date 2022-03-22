package StudyjavaMain;

public class Practice1436 {
	private int end;
	private int countEnd;
	private int requestEnd;
	
	public Practice1436(int requestEnd) {
		this.requestEnd = requestEnd;
		end = 666;
		countEnd=1;
	}
	
	public void calcEnd () {
		//만약 count와 요청한 넘버의 숫자가 다르다? 그럼 while반복, 만약 맞다? 그럼 while끝냄
		while(countEnd != requestEnd) {
			//반복하면서 end값을 하나씩 더한다.
			end++;
			//만약 end의 값중에 "666"이 포함되어있다면 count를 하나씩 더해서 requestEnd와 countEnd가 동일하면 끝나는 while문.
			if(String.valueOf(end).contains("666")) {
				countEnd++;
			}
		}
		System.out.println(end);
	}

}
