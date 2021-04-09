package algorithms.mArrays.mArrays;
//2825
import java.util.Scanner;

public class Chenar2 {
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
        int x = sc.nextInt();
        int ok = 0;
        for (int j = 1; j <= m; j++){
            if (A[1][j] == x || A[n][j] == x){
                ok = 1;
            }
        }

        for (int i = 1; i <= n; i++){
            if (A[i][1] == x || A[i][m] == x){
                ok = 1;
            }
        }

        if (ok == 1){
            System.out.println("DA");
        }else{
            System.out.println("NU");
        }
    }
}
