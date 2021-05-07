package algorithms.multiDimenArrays.multiDimArrays;
//772
import java.util.Scanner;

public class MaxAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v[] = new int[1000001];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = -1;
        int f;

        for (int i = 0; i <= 1000000; i++) {
            v[i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                f = sc.nextInt();
                v[f]++;
            }
        }
//Determinăm frecvența maximă – maximul din f[].
//Alegem valorile din v[] cu frecvența maximă, le sortăm și le afișăm.

        for (int i = 0; i <= 1000000; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        for (int i = 0; i <= 1000000; i++) {
            if (max == v[i]){
                System.out.println(i + " ");
            }
        }
    }
}
