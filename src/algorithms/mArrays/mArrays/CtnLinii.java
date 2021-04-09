package algorithms.mArrays.mArrays;
//776

import java.util.Scanner;
//Parcurgem liniile matricei. Verificăm dacă toate elementele de pe linia curentă sunt egale,
// și în caz afirmativ mărim un contor.
public class CtnLinii {
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
        int C = 0;
        for (int i = 1; i <= n; i++) {
            int nr = 0;
            for (int j = 1; j < m; j++) {
                if (A[i][j] == A[i][j+1]) {
                    nr++;
                }
            }
            if (nr == m - 1) {
                C++;
            }
        }
        System.out.println(C);
    }
}




