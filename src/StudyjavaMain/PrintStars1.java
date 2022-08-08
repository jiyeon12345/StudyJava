package StudyjavaMain;

import java.util.Scanner;

class PrintStars1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, w;


        do {
            System.out.print("n: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        do {
            System.out.print("w: ");
            w = stdIn.nextInt();
        } while (w <= 0 || w > n);

        for (int i = 0; i < n/w; i++) {
            System.out.println("*");
//            if (i % w == w - 1)
//                System.out.println();    // 以꾨컮轅�
        }
        if (n % w != 0) 
            System.out.println();        // 以꾨컮轅�
    }
}