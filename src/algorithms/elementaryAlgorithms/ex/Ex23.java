package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int t = -1;

        while (n > 0) {
            if (n % 10 % 2 == 0) {
                t = n % 10;
                break;
            }
            n = n / 10;
        }
        System.out.println(t);
    }
}
