package algorithms.mArrays.mArrays;
//804
import java.util.Scanner;

public class ColEgale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[52][52];
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int nr;
        int k = 0;
        for (int j = 1; j <= n; j++) {
            nr = 0;
            for (int i = 1; i < m; i++) {
                if (A[i][j] == A[i + 1][j]) {
                    nr++;
                }
            }
            if (nr == m - 1) {
                System.out.print(A[1][j] + " ");
                k++;
            }
        }
        if(k == 0){
            System.out.print("nu exista");
        }
    }
}



