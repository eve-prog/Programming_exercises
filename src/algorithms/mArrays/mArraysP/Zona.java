package algorithms.mArrays.mArraysP;

import java.util.Scanner;
//729
public class Zona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[202][202];
        int v[] = new int[1001];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        // Memoram cu 1 in v valorile de sub diagonala principala
        // si aflate deasupra diagonalei secundare
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) { //j<i adica se afla sub diagonala principala
                if (i + j < n + 1) {//i+j<n+1 adica se afla deasupra diagonalei secundare
                    v[a[i][j]] = 1;
                }
            }
        }
        for (int i = 0; i <= 1000; i++) {
            if (v[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
