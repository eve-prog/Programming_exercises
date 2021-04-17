package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        long min;

        if (a > b) {
            min = a;
        } else {
            min = b;
        }
        for (int i = 1; i < min / 2; i++)
            if (a % i == 0 && b % i == 0)
                System.out.print(i + " ");
    }
}


