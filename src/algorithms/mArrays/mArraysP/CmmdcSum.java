package algorithms.mArrays.mArraysP;

import java.util.Scanner;

//780
public class CmmdcSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[][] = new int[102][102];
        int S1 = 0;
        int S2 = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        //deasupra
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                S1 += A[i][j];
            }
        }
        //sub
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                S2 += A[i][j];
            }
        }
        while (S2 != S1) {
            if (S2 > S1) {
                S2 = S2 - S1;
            } else {
                S1 = S1 - S2;
            }
        }
        System.out.println(S2);
    }
}
