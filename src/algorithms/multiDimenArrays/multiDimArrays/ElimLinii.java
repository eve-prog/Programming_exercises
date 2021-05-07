package algorithms.multiDimenArrays.multiDimArrays;

import java.util.Scanner;
//774
public class ElimLinii {
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
            ok = 1;
            for (int d = 2; d * d <= A[i][1]; d++) {
                if (A[i][1] % d == 0) {
                    ok = 0;
                }
            }
            if(ok == 1 && A[i][1]>=2){
                for(int k = i+1; k<=n; k++){
                    for(int j = 1; j <= m; j++){
                        A[k-1][j] = A[k][j];
                    }
                }
                n--;
                i--;
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
