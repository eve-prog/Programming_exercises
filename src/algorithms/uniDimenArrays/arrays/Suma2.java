package algorithms.uniDimenArrays.arrays;
//491

import java.util.Scanner;

public class Suma2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vector[] = new int[1002];
        int S = 0;

        for (int i = 1; i <= n; i++) {
            vector[i] = sc.nextInt();
        }
        int p1 = 0;
        for (int p = 1; p <= n; p++) {
            if (vector[p] % 2 == 0) {
                p1 = p;
                break;
            }
        }
        int p2 = 0;
        for (int p = n; p >= 1; p--) {
            if (vector[p] % 2 == 0) {
                p2 = p;
                break;
            }
        }
        if (p1 == 0 && p2 == 0) {
            System.out.println("NU EXISTA");
        } else {
            S = 0;
            for (int p = p1; p <= p2; p++) {
                S = S + vector[p];
            }
            System.out.println(S);
        }
    }
}


