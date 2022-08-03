package StudyjavaMain;

public class PracticeKakao_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		int k = 2;
		
		String[][] reportArr = null;
        String[] checkOverlap = new String[k];
		
		
		for(int i = 0; i < report.length; i++) {
            reportArr = new String [report.length][2];
            String arr [] = new String [2];
            arr = report[i].split("\\s+");
            
            for(int j = 0; j < arr.length ; j ++) {
                reportArr[i][j] = arr[j];
            }
        }
		
		
		for(int i = 0; i < report.length; i++) {
			for(int j = 0; j < 2 ; j ++) {
                System.out.println(reportArr[i][j]);
            }
		}
		
		
		
	}

}
