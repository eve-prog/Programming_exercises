package algorithms.mArrays.mArrays;
//316
import java.util.Scanner;

public class MinCols2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[102][102];
        int m = sc.nextInt();
        int n = sc.nextInt();
        int nrMin = 1000000;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (A[i][j] < nrMin) {
                    nrMin = A[i][j];
                }
            }
        }
        for (int j = 1; j <= n; j++) {
            int ok = 0;
            for (int i = 1; i <= m; i++) {
                if (A[i][j] == nrMin) {
                    ok = 1;
                    break;
                }
            }
            if (ok == 1) {
                for (int i = 1; i <= m; i++) {
                    A[i][j] = nrMin;
                }
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




