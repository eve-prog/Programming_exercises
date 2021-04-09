package algorithms.mArrays.mArraysP;

import java.util.Scanner;

public class Zona4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Z = sc.nextInt();
        int A[][] = new int[102][102];
        int S = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        if (Z == 1){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i < j && i + j < n + 1) {
                        S += A[i][j];
                    }
                }
            }
        }
        if (Z == 2) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i < j && i + j > n + 1) {
                        S += A[i][j];
                    }
                }
            }
        }
        if (Z == 3) for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > j && i + j > n + 1) {
                    S += A[i][j];
                }
            }
        }
        if (Z == 4) {
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++) {
                    if (i > j && i + j < n + 1) {
                        S += A[i][j];
                    }
                }
            }
        }
        System.out.println(S);
    }
}
