package StudyjavaMain;

public class PracticeProgrammers1 {

	public static void main(String[] args) {
//		���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. ���� ��� s�� "a234"�̸� False�� �����ϰ� "1234"��� True�� �����ϸ� �˴ϴ�.
//		���� ����
//		s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
//		s�� ���� ���ĺ� ��ҹ��� �Ǵ� 0���� 9���� ���ڷ� �̷���� �ֽ��ϴ�.
//		����� ��
//		s	return
//		"a234"	false
//		"1234"	true

		//���� ��� : ���ڿ��� ���ڰ� �ϳ��� ������ false�� ����� �ȴٸ�,�̰� ���� �� �� ����. string.matches(pattern)
		
		String s  = "2343";
		
		Solution solution = new Solution();
		solution.solution(s);
	}

}

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
// ���� ã�� ���� ��� -> ������ 43��.
//        answer = s.matches("-?\\d+");
//        System.out.println(answer);
        
        //���� ���� �ڵ� Ȱ��
        //���� ���ܹ��� ������ �ߴµ�... �� ���� ������ ���� ���� �����. 
        
        if(s.length() == 4 || s.length() == 6) {
        	try {
        		int num = Integer.parseInt(s);
        		System.out.print(answer);
        		return answer;
        	}catch(NumberFormatException e) {
        		answer = false;
        		System.out.print(answer);
        		return answer;
        	}
        }
        
        else 
        	answer = false;
        	System.out.print(answer);
        	return answer;
        
    }
}
