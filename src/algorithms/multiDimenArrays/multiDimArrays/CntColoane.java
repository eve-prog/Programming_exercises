package algorithms.multiDimenArrays.multiDimArrays;
//777
import java.util.Scanner;

public class CntColoane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A [][]  = new int[102][102];

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                 A[i][j] = sc.nextInt();
            }
        }
        int C = 0;
        for (int j = 1; j <= m; j++){
            for (int i = 1; i < n; i++){
                if (A[1][j] == A[i+1][j]){
                    C++;
                    break;
                }
            }
        }
        System.out.println(C);
    }
}
