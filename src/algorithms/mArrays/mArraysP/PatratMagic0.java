package algorithms.mArrays.mArraysP;

import java.util.Scanner;

public class PatratMagic0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[502][502];
        int[] sLin = new int[502];
        int[] sCol = new int[502];
        int sDp = 0;
        int sDs = 0;

        int[] v = new int[250002];
        int ok = 1;

        for (int i = 1; i <= n * n; i++) {
            v[i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            sLin[i] = 0;
            sCol[i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] < 1 || a[i][j] > n * n) {
                    ok = 0;
                } else {
                    v[a[i][j]]++;
                    if (v[a[i][j]] > 1) {
                        ok = 0;
                    }
                }
                sLin[i] += a[i][j];
                sCol[j] += a[i][j];
                if (i == j) {
                    sDp += a[i][j];
                }
                if (i + j == n + 1) {
                    sDs += a[i][j];
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (sLin[i] != sLin[1]) {
                ok = 0;
            }
            if (sCol[i] != sCol[1]) {
                ok = 0;
            }
        }
        if (sLin[1] != sDp || sLin[1] != sDs || sLin[1] != sCol[1]) {
            ok = 0;
        }

        if (ok == 1) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
