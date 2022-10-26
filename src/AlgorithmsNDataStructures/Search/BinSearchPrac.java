package AlgorithmsNDataStructures.Search;

public class BinSearchPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,4,3,2,1,9,8};
		int search = 3;
		int findIdx = 0;
		System.out.printf("   |");
		for(int i = 0; i <arr.length; i++) {
			System.out.printf("%3d",i);
		}
		
		System.out.print("\n---+");
		for(int j = 0; j <arr.length*4; j++) {
			System.out.print("-");
		}
		
		for(int i= 0; i < arr.length; i++) {
			System.out.printf("\n   |");
			System.out.printf(String.format("%%%ds*\n", (i * 3) + 2), "");
			System.out.printf("%d  |", i);
			for(int k = 0 ; k < arr.length; k++){
				System.out.printf("%3d", arr[k]);
			}
			System.out.println();
			if(arr[i] == search) {
				findIdx = i; 
				break;
			}
		}
		
		System.out.printf("그 값은 arr[%d]에 있습니다.", findIdx);
		
		
	}

}
