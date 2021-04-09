package algorithms.mArrays.mArrays;
//2807
import java.util.Scanner;

public class Matrice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[52][52];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min1 = 10000000;
        int min2 = 10000000;
        int imin1 = 0;
        int imin2 =0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            if (A[i][m] < min1) {
                min1 = A[i][m];
                imin1 = i;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (A[i][1] < min2) {
                min2 = A[i][1];
                imin2 = i;
            }
        }
        int t = A[imin1][m];
        A[imin1][m] = A[imin2][1];
        A[imin2][1] = t;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}


