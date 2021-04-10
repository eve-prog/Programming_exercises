package meditatii.pbInfo;

import java.util.Scanner;

//387
public class Ex8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        long S = 0;

        for (long d = 1; d * d <= n; d++) {
            if (n % d == 0) {
                if (d % 2 != 0) {
                    S = S + d;
                }
                if ((n / d) % 2 != 0) {
                    S = S + n / d;
                }
            }
            if (d * d == n) {
                if (d % 2 != 0) {
                    S = S - d;
                }
            }
        }
        System.out.println(S);
    }
}