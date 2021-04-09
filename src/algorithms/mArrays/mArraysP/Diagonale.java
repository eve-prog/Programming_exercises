package algorithms.mArrays.mArraysP;
//313
import java.util.Scanner;

public class Diagonale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[][] = new int[102][102];
        int S1 = 0;
        int S2 = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            S1 += A[i][i];
        }
        for (int i = 1; i <= n; i++) {
            S2 += A[i][n + 1 - i];
        }

        if (S1 - S2 < 0) {
            System.out.println((-1) * (S1 - S2));
        } else {
            System.out.println(S1 - S2);
        }
    }
}

