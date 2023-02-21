package CordingTest;

public class BunchOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		
		Solution solution = new Solution(cards1,cards2,goal);
		System.out.println("result solution1 : "+solution.solution1());
		Solution solution1 = new Solution(cards1,cards2,goal);
		System.out.println("result solution2 : "+solution1.solution2());
	}

	
}

class Solution {
	String[] cards1;
	String[] cards2;
	String[] goal;
	int cards1Index = 0;
	int cards2Index = 0;
	int cards1Length = 0;
	int cards2Length = 0;
	
	public Solution ( String[] cards1, String[] cards2, String[] goal) {
		this.cards1 = cards1;
		this.cards2 = cards2;
		this.goal = goal;
		this.cards1Length = cards1.length;
		this.cards2Length = cards2.length;
	}
	
    public String solution1() {
        for(String curSr : goal) {
        	if(cards1Index < cards1Length && curSr.equals(cards1[cards1Index])) {
        		cards1Index++;
        	}else if(cards2Index < cards2Length && curSr.equals(cards2[cards2Index])) {
        		cards2Index++;
        	} else {
        		return "NO";
        	}
        }
        return "YES";
    }
    
    public String solution2() {
        for(String curSr : goal) {
        	if(cards1Index < cards1Length ? curSr.equals(cards1[cards1Index]) : false) {
        		cards1Index++;
        	}else if(cards2Index < cards2Length ? curSr.equals(cards2[cards2Index]) : false) {
        		cards2Index++;
        	} else {
        		return "NO";
        	}
        }
        return "YES";
    }
}