package algorithms.multiDimenArrays.multiDimArrays;
import java.util.Scanner;
//2800
public class Chenar1 {

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
        for (int j = 1; j <= m; j++) {
            A[n][j] = A[n][m];
        }
        for (int j = 1; j <= m; j++) {
             A[1][j] = A[n][j];
        }
        for (int i = 1; i <= n; i++) {
            A[i][m] = A[n][m];
        }
        for (int i = 1; i <= n; i++) {
            A[i][1] = A[i][m];
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
