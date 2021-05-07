package algorithms.multiDimenArrays.multiDimArrays;
//767
import java.util.Scanner;

public class SumaPare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[1000][1000];

        //citire linii si coloane
        int n = sc.nextInt();
        int m = sc.nextInt();

        //citire matrice
        for (int i = 0; i < n; i++) { //linia i
            for (int j = 0; j < m; j++) { //linia j
                A[i][j] = sc.nextInt();
            }
        }

        int S = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] % 2 == 0) {
                    S = S + A[i][j];
                }
            }
        }
        System.out.println(S);
    }
}
