package StudyjavaMain;

public class PracticeProgrammers1 {

	public static void main(String[] args) {
//		문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
//		제한 사항
//		s는 길이 1 이상, 길이 8 이하인 문자열입니다.
//		s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
//		입출력 예
//		s	return
//		"a234"	false
//		"1234"	true

		//구현 방법 : 문자열을 문자가 하나라도 있으면 false로 만들면 된다면,이걸 쓰면 될 것 같다. string.matches(pattern)
		
		String s  = "2343";
		
		Solution solution = new Solution();
		solution.solution(s);
	}

}

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
// 내가 찾은 쉬운 방법 -> 점수는 43점.
//        answer = s.matches("-?\\d+");
//        System.out.println(answer);
        
        //남이 적은 코드 활용
        //나도 예외문을 쓰려고 했는데... 저 예외 구문이 뭔지 몰라서 못썼다. 
        
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
