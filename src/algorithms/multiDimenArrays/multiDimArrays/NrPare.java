package algorithms.multiDimenArrays.multiDimArrays;

import java.util.Scanner;

public class NrPare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[102][102];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nrCount[] = new int [102];
        int nrMax = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n ; i++) {
            nrCount[i] = 0;
            for (int j = 1; j <= m; j++) {
                if (A[i][j] % 2 == 0){
                    nrCount[i]++;
                }
            }
            if(nrCount[i] > nrMax){
                nrMax = nrCount[i];
            }
        }
        for (int i = 1; i <= n; i++) {
            if(nrCount[i] == nrMax){
                System.out.print(i + " ");
            }
        }
    }
}
