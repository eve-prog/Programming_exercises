package algorithms.mArrays.mArraysP;

import java.util.Scanner;

//787
public class MatSim1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[102][102];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                 a[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (i + j < n + 1) {
                    int aux = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = aux;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
