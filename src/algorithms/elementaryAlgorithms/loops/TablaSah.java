package algorithms.elementaryAlgorithms.loops;

import java.util.Scanner;

public class TablaSah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char c = scanner.next().charAt(0);
        char d = scanner.next().charAt(0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(c);
                } else {
                    System.out.print(d);
                }
            }
            System.out.println();
        }
    }
}