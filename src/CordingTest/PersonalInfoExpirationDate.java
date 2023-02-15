package CordingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalInfoExpirationDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        String today2 = "2020.01.01";
        String[] terms2 = {"Z 3", "D 5"};
        String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        int[] result1 = solution(today, terms, privacies);
        int[] result2 = solution(today2, terms2, privacies2);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
	}
	
	public static int[] solution(String today, String[] terms, String[] privacies) {
        int todayInt = Integer.parseInt(today.replaceAll("\\D", ""));
        
        //terms 구분을 map형태로 저장하기 위해 적용
        Map<Character, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] temp = term.split(" ");
            termMap.put(temp[0].charAt(0), Integer.parseInt(temp[1]));
        }
        
        //날짜를 모두 숫자로 만든다.
        //2022.04.22 -> 20220422 : 년도를 알고싶으면 /10000 이런식으로 확인,
        //추가되는 날짜가 있다면 달 년 추가하기
        List<Integer> expList = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            String pastDate = privacy.replaceAll("\\D", "");
            int pastMonth = Integer.parseInt(pastDate) / 100 % 100;
            int pastYear = Integer.parseInt(pastDate) / 10000;
            char type = privacy.charAt(privacy.length() - 1);
            int addMonth = termMap.get(type);
            int addYear = (pastMonth + addMonth - 1) / 12;
            int expMonth = (addMonth + pastMonth - 1) % 12 + 1;
            int expYear = pastYear + addYear;
            int expDay = Integer.parseInt(pastDate) % 100;
            int expDate = expDay + (expMonth * 100) + (expYear * 10000);
            if (todayInt >= expDate) {
                expList.add(i + 1);
            }
        }
        
        //stream을 이용하여 for문을 사용하지 않아도 데이터 확인 가능!!
        int[] answer = expList.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }

}
