package algorithms.elementaryAlgorithms.fibo;

import java.util.Scanner;

public class FiboVerif {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();

            int x = 1;
            int y = 1;
            int z = 2;

            while (z < a) {
                x = y;
                y = z;
                z = x + y;
            }
            if (z == a || a == 1 || a == 2) {
                System.out.println("DA");
            } else {
                System.out.println("NU");
            }
        }
    }
}



