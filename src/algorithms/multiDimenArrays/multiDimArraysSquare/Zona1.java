package algorithms.multiDimenArrays.multiDimArraysSquare;
//782

import java.util.Scanner;

public class Zona1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[202][202];
        int v[] = new int[1001];
        int max = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > j && i + j > n + 1) {
                    v[a[i][j]]++;
                    if (a[i][j] > max) {
                        max = a[i][j];
                    }
                }
            }
        }
        for (int i = 1; i <= max; i++) {
            if (v[i] >= 2) {
                System.out.print(i + " ");
            }
        }
    }
}
