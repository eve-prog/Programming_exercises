package algorithms.mArrays.mArrays;

import java.util.Scanner;

public class SumElPare {

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
        int smax = -1;
        int imax = 0;
        for (int i = 1; i <= n; i++) {
            int S = 0;
            for (int j = 1; j <= m; j++) {
                if (A[i][j] % 2 == 0) {
                    S = S + A[i][j];
                }
            }
            if (S > smax) {
                smax = S;
                imax = i;
            }
        }
        System.out.println(imax);
    }
}