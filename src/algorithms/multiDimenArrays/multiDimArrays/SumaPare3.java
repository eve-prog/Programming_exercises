package algorithms.multiDimenArrays.multiDimArrays;
//768
import java.util.Scanner;

public class SumaPare3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = 0;
        int[] c = new int[10001];
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int x = sc.nextInt();

                if (x % 2 == 0 && c[x]  == 0){
                    c[x] = 1;
                    S += x;
                }
            }
        }
        System.out.println(S);
    }
}
