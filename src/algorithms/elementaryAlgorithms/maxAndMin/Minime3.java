package algorithms.elementaryAlgorithms.maxAndMin;
//274
import java.util.Scanner;

public class Minime3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min1 = 1000000;
        int min2 = 1000000;
        int min3 = 1000000;
        int x;

        for (int i = 1; i <= n; i++) {
            x = scanner.nextInt();

            if (x < min1) {
                min3 = min2;
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min3 = min2;
                min2 = x;
            } else if (x < min3) {
                min3 = x;
            }
        }
        System.out.println(min3 + " " + min2 + " " + min1);
    }
}
