package algorithms.mArrays.mArrays;
//668
import java.util.Scanner;

public class Identice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[102][102];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i,j;

        for (i = 1; i <= n; i++) {
            for ( j = 1; j <= m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int c = 0;
        int egale;
        for (i = 1; i <= n; i++) {
            egale = 1;
            for (j = 1; j <= m && egale == 1; j++) {
                if (A[i][j] != A[i - 1][j]) {
                    egale = 0;
                }
            }
            if (egale == 1) {
                c++;
            }
        }
        System.out.println(c);
    }
}