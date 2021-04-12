package algorithms.mArrays.mArrays;
//2874
import java.util.Scanner;

public class SortMatrixCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[101][101];
        int n = sc.nextInt();
        int m = sc.nextInt();
        char c = sc.next().charAt(0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        if (c == '+') {
            int ok;
            for (int j = 1; j <= m; j++) {
                do {
                    ok = 1;
                    for (int i = 1; i <= n - 1; i++) {
                        if (A[i][j] > A[i+1][j]) {
                            ok = 0;

                            int aux = A[i][j];
                            A[i][j] = A[i+1][j];
                            A[i+1][j] = aux;
                        }
                    }
                }
                while (ok == 0);
            }
        }
        if (c == '-') {
            int ok;
            for (int j = 1; j <= n; j++) {
                do {
                    ok = 1;
                    for (int i = 1; i <= n - 1; i++) {
                        if (A[i][j] < A[i+1][j]) {
                            ok = 0;

                            int aux = A[i][j];
                            A[i][j] = A[i+1][j];
                            A[i+1][j] = aux;
                        }
                    }
                }
                while (ok == 0);
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

