package algorithms.elementaryAlgorithms.loops;

import java.util.Scanner;

//1376
public class LaturiTriunghi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.print("*");
        } else {
            int s = n - 2;
            int t = 1;

            for (int i = 1; i < n; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

            for (int i = 2; i <= n - 1; i++) {
                for (int j = 1; j <= s; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 1; j <= t; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
                s--;
                t = t + 2;
            }
            System.out.print("*");
            for (int i = 1; i <= n - 1; i++) {
                System.out.print(" ");
                System.out.print("*");
            }
        }
    }
}

