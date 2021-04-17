package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int ogl = 0;
        long S = 0;

        for (int i = 1; i <= n; i++) {
            int numar = myObj.nextInt(); // citire numere
            ogl = 0;                     //reinitializare nr oglindit
            while (numar != 0) {         // oglindire
                ogl = 10 * ogl + numar % 10;
                numar = numar / 10;
            }
            for (int d = 1; d * d <= ogl; d++) { //divizori
                if (ogl % d == 0) {
                    S = S + d;
                    int j = ogl / d;
                    if (j != d) {
                        S = S + j;
                    }
                }
            }
        }
        System.out.println(S);
    }
}