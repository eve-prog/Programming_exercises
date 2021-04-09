package algorithms.mArrays.mArrays;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v[] = new int[10002];
        int w[] = new int[10002];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i, j, k, vmax = 0, aux, nr;

        k = 0;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                k++;
                v[k] = sc.nextInt();
                w[k] = 0;
            }
        }
///ordonam crescator vectorul
        for (i = 1; i <= k - 1; i++) {
            for (j = i + 1; j <= k; j++) {
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        v[k + 1] = v[k] + 1;
        nr = 1;
        for (i = 2; i <= k + 1; i++) {
            if (v[i - 1] == v[i]) {
                nr++;
            } else {
                w[i - 1] = nr;
                if (nr > vmax) {
                    vmax = nr;
                }
                nr = 1;
            }
        }

        for (i = 1; i <= k; i++) {
            if (w[i] == vmax) {
                System.out.println(v[i] + " ");
            }
        }

    }
}
