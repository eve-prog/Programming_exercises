package algorithms.elementaryAlgorithms.maxAndMin;

import java.util.Scanner;

public class MaximPar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxim = -1;
        int apare = 0;
        int nrpare = 0;

        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            if (m % 2 == 0) {
                nrpare++;
                if (m > maxim) {
                    maxim = m;
                    apare++;
                }
            }
        }
        if (nrpare == 0) {
            System.out.println(-1);
        } else {
            System.out.println(maxim + " " + apare);
        }
    }
}
