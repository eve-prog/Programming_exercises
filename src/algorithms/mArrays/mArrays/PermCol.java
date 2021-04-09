package algorithms.mArrays.mArrays;
//770
import java.util.Scanner;

public class PermCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[102][102];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int B[] = new int[102];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            B[i] = A[i][1];
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m-1; j++) {
              int temp = A[i][j];
              A[i][j] = A[i][j+1];
                A[i][j+1] = temp;
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


