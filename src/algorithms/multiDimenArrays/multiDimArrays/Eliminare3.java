package algorithms.multiDimenArrays.multiDimArrays;

import java.util.Scanner;

public class Eliminare3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[52][52];
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int j = 1; j <= m; j++) { //parcurge linia
            A[n-1][j] = A[n][j];
        }
        n--;
        for (int i = 1; i <= n; i++) { //parcurge coloanea
            A[i][m-1] = A[i][m];
        }
        m--;


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }
}
