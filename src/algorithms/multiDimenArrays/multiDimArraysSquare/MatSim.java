package algorithms.multiDimenArrays.multiDimArraysSquare;

import java.util.Scanner;

//786
public class MatSim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[][] = new int[102][102];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > j) {
                   int aux = A[i][j];
                   A[i][j] = A[j][i];
                   A[j][i] = aux;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
