package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

public class Ex22 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int max = -1;

        do {
            int u = n % 10;
            n = n / 10;
            if (u % 2 != 0) {
                if (u > max) {
                    max = u;
                }
            }
        } while (n != 0);

        if (max == -1) {
            System.out.println("nu exista");
        } else {
            System.out.println(max);
        }
    }

}