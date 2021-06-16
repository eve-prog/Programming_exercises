package algorithms.uniDimenArrays.sequenceArrays;
//519
import java.util.Scanner;

public class Secventa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[1001];

        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] y = new int[1001];

        for (int j = 1; j <= m; j++) {
            y[j] = sc.nextInt();
        }

        int aparitii = 0;
        int egalitati;

        for (int i = 1; i + m - 1 <= n; i++) {
            egalitati = 0;
            for (int j = 1; j <= m; j++) {
                if (y[j] == x[i + j - 1]) {
                    egalitati++;
                }
            }
            if (egalitati == m) {
                aparitii = i;
                break;
            }
        }
        if (aparitii == 0) {
            System.out.println("NU");
        } else {
            System.out.println("" + aparitii);
        }
    }
}
