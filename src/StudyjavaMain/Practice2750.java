package StudyjavaMain;

public class Practice2750 {
	private int [] arr = {2,4,3,1,5};
	
	public Practice2750() {
		
		for(int i=0; i < arr.length ; i ++) {
			for(int j=0 ; j <arr.length ; j++) {
				
				if(arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
				
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
