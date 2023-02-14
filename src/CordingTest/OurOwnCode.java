package CordingTest;

public class OurOwnCode {
/* 둘만의 암호
 * 두 문자열 s와 skip, 그리고 자연수 index가 주어질 때, 다음 규칙에 따라 문자열을 만들려 합니다. 암호의 규칙은 다음과 같습니다.

문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다.
index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아갑니다.
skip에 있는 알파벳은 제외하고 건너뜁니다.
예를 들어 s = "aukks", skip = "wbqd", index = 5일 때, a에서 5만큼 뒤에 있는 알파벳은 f지만 [b, c, d, e, f]에서 'b'와 'd'는 skip에 포함되므로 세지 않습니다. 
따라서 'b', 'd'를 제외하고 'a'에서 5만큼 뒤에 있는 알파벳은 [c, e, f, g, h] 순서에 의해 'h'가 됩니다. 나머지 "ukks" 또한 위 규칙대로 바꾸면 "appy"가 되며 결과는 "happy"가 됩니다.

두 문자열 s와 skip, 그리고 자연수 index가 매개변수로 주어질 때 위 규칙대로 s를 변환한 결과를 return하도록 solution 함수를 완성해주세요.

-> 해결방법 : 1. 문자열을 배열로 모두 변환
2. index번째 값을 + 해서 값 찾기. (for문 통해 확인)
3. for문 돌려서 찾은 값을 skip과 비교해서 같은 값이 있는지 확인, 있으면 continue

*/
	
	
	class Solution {
	    public String solution(String s, String skip, int index) {
//	        String answer = "";
	    	char[] answer = s.toCharArray();
	    	
	    	//answer를 index번째 돌면서 하나씩 ++한다. (만약 z면 a로 변경)
	    	for(int i = 0 ; i < answer.length; i++) {
	    		for(int j = 0 ; j < index ; i++) {
	    			char chgAnswer = (char) (answer[i]+1);
	    			if(chgAnswer == 'z') chgAnswer = 'a';    
	    			
	    			while(skip.contains(String.valueOf(chgAnswer))) {
		    			// contains -> 특정 대상 문자열(skip)에 문자열(chgAnswer)이 포함되어있는지 확인하는 함수
	    				// boolean형으로 이루어짐. 있으면 true, 없으면 false (while을 쓰는 것이 더 나은 방법)
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
