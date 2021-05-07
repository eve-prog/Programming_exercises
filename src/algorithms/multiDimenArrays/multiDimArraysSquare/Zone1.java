package algorithms.multiDimenArrays.multiDimArraysSquare;
//781

import java.util.Scanner;

public class Zone1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[][] = new int[n + 1][n + 1];
        int B[] = new int[9];
        int S1 = 0;
        int S2 = 0;
        int S3 = 0;
        int S4 = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        //VEST
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > j && i + j < n + 1) {
                    S1 += A[i][j];
                }
            }
        }
        //SUD
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > j && i + j > n + 1) {
                    S2 += A[i][j];
                }
            }
        }
        //EST
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i < j && i + j > n + 1) {
                    S3 += A[i][j];
                }
            }
        }
        //NORD
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i < j && i + j < n + 1) {
                    S4 += A[i][j];
                }
            }
        }
        B[0] = 0;
        B[1] = S1;
        B[2] = S2;
        B[3] = S3;
        B[4] = S4;

        for (int i = 1; i <= 3; i++) {
            for (int j = i + 1; j <= 4; j++) {
                if (B[i] > B[j]) {
                    int aux = B[i];
                    B[i] = B[j];
                    B[j] = aux;
                }
            }
        }
        for (int i = 1; i <= 4; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
