package algorithms.multiDimenArrays.multiDimArrays;
//619
import java.util.Scanner;

public class SortLin {
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
        int ok;
        for (int i = 1; i <= n; i++) {
            do {
                ok = 1;
                for (int j = 1; j <= m - 1; j++) {
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
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
