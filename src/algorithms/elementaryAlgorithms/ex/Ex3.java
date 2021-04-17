package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

//3665
public class Ex3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        long max = -1;
        long c;

        do {
            c = n % 10;
            if (c % 2 == 0) {
                if (c > max) {
                    max = c;
                }
            }
            n = n / 10;
        } while (n != 0);
        if (max == -1) {
            max = 10;
        }
        System.out.println(max);
    }
}

