package algorithms.elementaryAlgorithms.loops;

import java.util.Scanner;

public class Patrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char c = scanner.next().charAt(0);
        char d = scanner.next().charAt(0);


        for (int i = 1; i <= n; i++) {
            System.out.print(c);
        }
        for (int i = 2; i <= n - 1; i++) {
            System.out.println(c);
            for (int j = 2; j <= n - 1; j++) {
                System.out.print(d);
            }
            System.out.print(c);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(c);
        }
    }
}

