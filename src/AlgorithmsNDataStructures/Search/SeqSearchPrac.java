package AlgorithmsNDataStructures.Search;

public class SeqSearchPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,3,5,7,7,7,7,8,9,9};
		int key = 9;
		
		int findIdx = binsearchX(arr,key);
		
		if(findIdx == 0) 
			System.out.println("해당 값은 없습니다.");
		else
			System.out.printf("%d값의 첫번째 index값은 %d입니다.", key, findIdx);
		
	}

	private static int binsearchX(int[] arr, int key) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int end = (arr.length) -1;
		
		do {
			int center = (start+end) /2;
			if(arr[center] == key) {
				for(; center < start; center--) {
					if(arr[center-1] < key) break;
				}
				return center;
			}else if(arr[center] < key) {
				start = center +1;
			}else if(arr[center] > key) {
				end = center-1;
			}
		}while(start <= end);
		
		
		return -1;
	}

}
