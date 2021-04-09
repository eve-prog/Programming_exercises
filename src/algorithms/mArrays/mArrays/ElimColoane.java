package algorithms.mArrays.mArrays;
//775

import java.util.Scanner;

public class ElimColoane {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[102][102];
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int j = m; j >= 1; j--) {
            int ok = 0;
            for (int i = 1; i <= n; i++) {
                if (A[i][j] == 0) {
                    ok = 1;
                }
            }
            if (ok == 1) {
                for (int k = j; k < m; k++)
                    for (int i = 1; i <= n; i++)
                        A[i][k] = A[i][k + 1];
                m--;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}