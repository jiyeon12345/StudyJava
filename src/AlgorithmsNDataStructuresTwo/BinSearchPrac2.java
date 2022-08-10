package AlgorithmsNDataStructuresTwo;

import java.util.Arrays;

public class BinSearchPrac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,9,2,9,4,6,7,9};
		int[] index =  new int[arr.length];
		
		int count = searchIdx(arr, 9, index);
		if(count == 0)
			System.out.printf("%d는 존재하지 않습니다.\n",9);
		else
			System.out.printf("%d는 총%d개 있습니다.\n", 9, count);
			System.out.println(Arrays.toString(index));
	}

	private static int searchIdx(int[] arr, int key, int[] index) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int  i = 0 ; i < arr.length ; i++) {
			if(arr[i] == key) {
				index[count] = i;
				count++;
			}
		}
		return count;
	}

}
