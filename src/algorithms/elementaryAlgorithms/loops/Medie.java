package algorithms.elementaryAlgorithms.loops;

import java.util.Scanner;

public class Medie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float M  = 0;
        int count = 0;
        int S = 0;

        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            if (p % 2 == 0) {
                S = S + p;
                count++;
            }
        }
        M = (float) S/count;
        System.out.print(M);
    }
}
