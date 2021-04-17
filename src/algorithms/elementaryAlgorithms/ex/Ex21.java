package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int c1 = myObj.nextInt();
        int c2 = myObj.nextInt();

        for (int i = 1000; i <= 9999; ++i) {
            int cm = i / 1000;
            int cs = i / 100 % 10;
            int cz = i / 10 % 10;
            int cu = i % 10;
            if (cm >= c1 && cz <= c2 && cs == cu && cs % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}