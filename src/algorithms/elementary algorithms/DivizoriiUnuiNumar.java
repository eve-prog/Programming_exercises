package meditatii.pbInfo;

import java.util.Scanner;

public class DivizoriiUnuiNumar {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();

        for (int d = 1; d * d <= n; d++)
            if (n % d == 0) {
                System.out.print(d + " ");
                if (d * d < n) {
                    System.out.print(n / d + " ");
                }
            }
    }

}




