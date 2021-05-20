package algorithms.uniDimenArrays.arrays;
//163
import java.util.Scanner;

public class StergerePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = n-1; i >= 0; i--) {
            int d = 2; // divizori => nr prim
            int p = 1; // numere prime
            while (d * d <= v[i]) {
                if (v[i] % d == 0) {
                    p = 0;
                    break;
                }
                d++;
            }
            if (p == 1 && v[i] >= 2) {
                for (int j = i+1; j<=n-1;j++){
                    v[j-1] = v[j]; //v[j] se muta in stg lui
                }
                n--;
            }
        }
        for (int i=0; i<n; i++){
            System.out.print(v[i]+ " ");
        }
    }
}