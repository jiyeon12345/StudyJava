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
        
        //terms ������ map���·� �����ϱ� ���� ����
        Map<Character, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] temp = term.split(" ");
            termMap.put(temp[0].charAt(0), Integer.parseInt(temp[1]));
        }
        
        //��¥�� ��� ���ڷ� �����.
        //2022.04.22 -> 20220422 : �⵵�� �˰������ /10000 �̷������� Ȯ��,
        //�߰��Ǵ� ��¥�� �ִٸ� �� �� �߰��ϱ�
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
        
        //stream�� �̿��Ͽ� for���� ������� �ʾƵ� ������ Ȯ�� ����!!
        int[] answer = expList.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }

}
