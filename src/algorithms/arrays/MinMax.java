package algorithms.arrays;

import java.util.Scanner;
//486
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minim = 1000000;
        int maxim = 0;
        int i;

        int vector[] = new int[1000];

        for (i = 0; i < n; i++) {
            vector[i] = sc.nextInt();

            if (maxim < vector[i]) {
                maxim = vector[i];
            }
            if (minim > vector[i]) {
                minim = vector[i];
            }
        }
        System.out.println(minim + " " + maxim);
    }
}


