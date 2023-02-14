package CordingTest;

public class OurOwnCode {
/* �Ѹ��� ��ȣ
 * �� ���ڿ� s�� skip, �׸��� �ڿ��� index�� �־��� ��, ���� ��Ģ�� ���� ���ڿ��� ����� �մϴ�. ��ȣ�� ��Ģ�� ������ �����ϴ�.

���ڿ� s�� �� ���ĺ��� index��ŭ ���� ���ĺ����� �ٲ��ݴϴ�.
index��ŭ�� ���� ���ĺ��� z�� �Ѿ ��� �ٽ� a�� ���ư��ϴ�.
skip�� �ִ� ���ĺ��� �����ϰ� �ǳʶݴϴ�.
���� ��� s = "aukks", skip = "wbqd", index = 5�� ��, a���� 5��ŭ �ڿ� �ִ� ���ĺ��� f���� [b, c, d, e, f]���� 'b'�� 'd'�� skip�� ���ԵǹǷ� ���� �ʽ��ϴ�. 
���� 'b', 'd'�� �����ϰ� 'a'���� 5��ŭ �ڿ� �ִ� ���ĺ��� [c, e, f, g, h] ������ ���� 'h'�� �˴ϴ�. ������ "ukks" ���� �� ��Ģ��� �ٲٸ� "appy"�� �Ǹ� ����� "happy"�� �˴ϴ�.

�� ���ڿ� s�� skip, �׸��� �ڿ��� index�� �Ű������� �־��� �� �� ��Ģ��� s�� ��ȯ�� ����� return�ϵ��� solution �Լ��� �ϼ����ּ���.

-> �ذ��� : 1. ���ڿ��� �迭�� ��� ��ȯ
2. index��° ���� + �ؼ� �� ã��. (for�� ���� Ȯ��)
3. for�� ������ ã�� ���� skip�� ���ؼ� ���� ���� �ִ��� Ȯ��, ������ continue

*/
	
	
	class Solution {
	    public String solution(String s, String skip, int index) {
//	        String answer = "";
	    	char[] answer = s.toCharArray();
	    	
	    	//answer�� index��° ���鼭 �ϳ��� ++�Ѵ�. (���� z�� a�� ����)
	    	for(int i = 0 ; i < answer.length; i++) {
	    		for(int j = 0 ; j < index ; i++) {
	    			char chgAnswer = (char) (answer[i]+1);
	    			if(chgAnswer == 'z') chgAnswer = 'a';    
	    			
	    			while(skip.contains(String.valueOf(chgAnswer))) {
		    			// contains -> Ư�� ��� ���ڿ�(skip)�� ���ڿ�(chgAnswer)�� ���ԵǾ��ִ��� Ȯ���ϴ� �Լ�
	    				// boolean������ �̷����. ������ true, ������ false (while�� ���� ���� �� ���� ���)
	    				chgAnswer = (char) (answer[i]+1);
	    				if(chgAnswer == 'z') chgAnswer = 'a';    
		    		}
	    			answer[i] = chgAnswer;
	    		}
	    	}
	        return String.valueOf(answer);
	    }
	}
	
	
	

}
