package algorithms.elementaryAlgorithms.loops;
//1564
import java.util.Scanner;

public class TrunghiDublu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.print("*");
        } else {
            int s = n - 1;
            int t = n + 1;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= s; j++) {
                    System.out.print(" ");
                }
                for (int r = 1; r < t; r++) {
                    System.out.print("*");
                }
                System.out.println();
                s++;
                t = t - 1;
            }
        }
    }
}





