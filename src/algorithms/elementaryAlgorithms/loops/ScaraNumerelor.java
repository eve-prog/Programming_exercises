package algorithms.elementaryAlgorithms.loops;
//1569
import java.util.Scanner;

public class ScaraNumerelor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
