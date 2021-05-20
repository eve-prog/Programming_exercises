package algorithms.elementaryAlgorithms.loops;
//2281
import java.util.Scanner;

public class Sageata {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;

        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
            s++;
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
        }
        for (int i = n ; i >= 1; i--) {
            s--;
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
        }
    }
}
