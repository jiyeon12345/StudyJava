package StudyjavaMain;

import java.util.Scanner;

class Max3Method {
    static int max3(int a, int b, int c) {
        int max = a;                      
        if (b > max) 
        	max = b;
        if (c > max) 
        	max = c;

        return max;
    }
    
    public static int searchMax4(int a, int b , int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
    	return max;
    }
    
    public static int findMin3(int a, int b, int c) {
    	int min = a;
    	if(b < min) min = b;
    	if(c < min) min = c;
    	return min;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("searchMax4 = " + searchMax4(a,b,c,d));
    }
}