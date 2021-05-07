package algorithms.multiDimenArrays.multiDimArrays;

import java.util.Scanner;

//785
public class ElimMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[][] = new int[102][102];
        int min = 1000000;
        int max = -1;
        int imax = -1, jmax = -1;
        int imin = -1, jmin = 1000000;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                    imax = i;
                    jmax = j;
                }
                if (A[i][j] < min) {
                    min = A[i][j];
                    imin = i;
                    jmin = j;
                }
            }
        }
        if (imin != imax) {//daca maximul si minimul nu sunt pe aceeasi linie
            for (int i = imin; i < n; i++) {
                for (int j = 1; j <= m; j++) {
                    A[i][j] = A[i + 1][j];
                }
            }
            n--;
        }
        if (imax > imin) imax--;{//daca maximul e mai jos decat minimul
            for (int i = imax; i < n; i++) {
                for (int j = 1; j <= m; j++) {
                    A[i][j] = A[i + 1][j];
                }
            }
            n--;
        }
        if (jmin != jmax) {//daca maximul si minimul nu sunt pe aceeasi coloana
            for (int j = jmax; j < m; j++) {
                for (int i = 1; i <= n; i++) {
                    A[i][j] = A[i][j + 1];
                }
            }
            m--;
        }
        if (jmin > jmax) jmin--;{//daca minimul e mai la dreapta decat maximul
            for (int j = jmin; j < m; j++) {
                for (int i = 1; i <= n; i++) {
                    A[i][j] = A[i][j + 1];
                }
            }
            m--;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}

