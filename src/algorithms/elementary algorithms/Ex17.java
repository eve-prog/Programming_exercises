package meditatii.pbInfo;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        long P = 1;

        for (int i = 1; i <= n; i++) {
            P = 10 * P;
        }
        System.out.println(P);
    }

}
