package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

public class Problema {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        long k = myObj.nextLong();
        long P = 1;
        long c;

        while (n != 0) {
            c = n % 10;
            if (c != k) {
                P = P * c;
            }
            n = n / 10;
        }
        if (P != 1) {
            System.out.println(P);
        } else {
            System.out.println(0);
        }
    }

}