package algorithms.multiDimenArrays.multiDimArrays;
//2877
import java.util.Scanner;

public class SortMatrixLinCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[][] = new int[101][101];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int ok;
        for (int i = 1; i <= n; i++) {
            do {
                ok = 1;
                for (int j = 1; j <= n - 1; j++) {
                    if (A[i][j] > A[i][j + 1]) { //sunt pe linia i si se muta doar j
                        ok = 0;

                        int aux = A[i][j];
                        A[i][j] = A[i][j + 1];
                        A[i][j + 1] = aux;
                    }
                }
            }
            while (ok == 0);
        }

        for (int j = 1; j <= n; j++) {
            do {
                ok = 1;
                for (int i = 1; i <= n - 1; i++) {
                    if (A[i][j] > A[i+1][j]) { //sunt pe linia i si se muta doar j
                        ok = 0;

                        int aux = A[i][j];
                        A[i][j] = A[i+1][j];
                        A[i+1][j] = aux;
                    }
                }
            }
            while (ok == 0);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}