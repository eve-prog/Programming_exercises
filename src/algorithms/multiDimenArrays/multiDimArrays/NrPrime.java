package algorithms.multiDimenArrays.multiDimArrays;
//666
import java.util.Scanner;

public class NrPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[102][102];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ok;
        int c = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 2; i <= n; i=i+2) {
            for (int j = 1; j <= m; j++) {
                ok = 1;
                for (int d = 2; d * d <= A[i][j]; d++) {
                    if (A[i][j] % d == 0) {
                        ok = 0;
                    }
                }
                if (ok == 1 && A[i][j] >= 2) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}