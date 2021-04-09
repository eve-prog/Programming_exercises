package meditatii.pbInfo;
//388
import java.util.Scanner;

public class Ex6 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        long C = 0;

        for (long d = 1; d <= n; d++) {
            if (n % d == 0) {
                if (d % 2 == 0) {
                    C++;
                }
            }
        }
        System.out.println(C);
    }
}

