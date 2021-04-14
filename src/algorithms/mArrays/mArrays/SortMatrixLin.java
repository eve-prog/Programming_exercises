package algorithms.mArrays.mArrays;

import java.util.Scanner;

//2873
public class SortMatrixLin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[101][101];
        int n = sc.nextInt();
        int m = sc.nextInt();
        char c = sc.next().charAt(0);
        int v[] = new int[10002];
        int k = 0;
        int l;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                A[i][j] = sc.nextInt();
                k++;
                v[k] = A[i][j];
            }
        }
        int ok;
        do {
            ok = 1;
            for (int j = 1; j <= k - 1; j++) {
                if (v[j] > v[j + 1]) {
                    ok = 0;

                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
        while (ok == 0);
        if (c == '+') {
            l = 0;
            for (int i = 1; i <= n; i++) {
                for(int j = 1; j <= m; j++){
                    l++;
                    A[i][j] = v[l];
                }
            }
        }
        if (c == '-') {
            l = k + 1;
            for (int i = 1; i <= n; i++) {
                for(int j = 1; j <= m; j++){
                    l--;
                    A[i][j] = v[l];
                }
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
