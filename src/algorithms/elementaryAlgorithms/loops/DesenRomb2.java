package algorithms.elementaryAlgorithms.loops;

import java.util.Scanner;

public class DesenRomb2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = n - 1;
        int t = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= s; j++) {
                System.out.print("#");
            }
            for (int j = 1; j <= t; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= s; j++) {
                System.out.print("#");
            }
            System.out.println();
            s--;
            t += 2;
        }
        s++;
        t -= 2;
        for (int i = n - 1; i >= 1; i--) {
            s++;
            t -= 2;
            for (int j = 1; j <= s; j++) {
                System.out.print("#");
            }
            for (int j = 1; j <= t; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= s; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

