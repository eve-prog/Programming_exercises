package algorithms.uniDimenArrays.sequenceArrays;
//520
import java.util.Scanner;

public class Secventa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[1001];
        int aparitii = 0;
        int egalitati = 0;

        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] y = new int[1001];
        for (int j = 1; j <= m; j++) {
            y[j] = sc.nextInt();
        }
        for (int i = 1; i+m-1 <= n; i++) {
            egalitati = 0;
            for (int j = 1; j <= m; j++) {
                if (y[j] == x[i + j - 1]) {
                    egalitati++;
                }
            }
            if(egalitati == m) {
                aparitii++;
            }

        }
        System.out.println(aparitii);

    }
}
