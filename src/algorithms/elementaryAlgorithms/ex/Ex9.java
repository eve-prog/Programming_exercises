package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

//388
public class Ex9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        long C = 0;

        for (long d = 1; d * d <= n; d++) {
            if (n % d == 0) {
                if (d % 2 == 0) {
                    C++;
                }
                if ((n / d) % 2 == 0) {
                    C++;
                }
            }
            if (d * d == n){
                if (d % 2 == 0){
                    C--;
                }
            }
        }
        System.out.println(C);
    }
}
