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
		//���� count�� ��û�� �ѹ��� ���ڰ� �ٸ���? �׷� while�ݺ�, ���� �´�? �׷� while����
		while(countEnd != requestEnd) {
			//�ݺ��ϸ鼭 end���� �ϳ��� ���Ѵ�.
			end++;
			//���� end�� ���߿� "666"�� ���ԵǾ��ִٸ� count�� �ϳ��� ���ؼ� requestEnd�� countEnd�� �����ϸ� ������ while��.
			if(String.valueOf(end).contains("666")) {
				countEnd++;
			}
		}
		System.out.println(end);
	}

}
