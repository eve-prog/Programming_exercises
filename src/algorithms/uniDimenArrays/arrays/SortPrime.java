package algorithms.uniDimenArrays.arrays;
//510

import java.util.Scanner;

public class SortPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];
        int ok;
        int prim;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        do {
            ok = 1;
            for (int p = 1; p <= n - 1; p++){
                if (v[p] > v[p+1]){
                    ok = 0;

                    int aux = v[p];
                    v[p] = v[p+1];
                    v[p+1] = aux;
                }
            }
        }while(ok == 0);

        for (int i = 1; i <= n; i++){
            prim = 1;
            for (int d = 2; d*d <= v[i]; d++){
                if (v[i] % d == 0){
                    prim = 0;
                }
            }
            if (prim == 1 && v[i] >= 2){
                System.out.print(v[i] + " ");
            }
        }
    }
}
