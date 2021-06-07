package algorithms.elementaryAlgorithms.maxAndMin;
//2257
import java.util.Scanner;

public class PozMax1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.next());
        double p = 0;
        double u = 0;
        double max = -1;
        double max2 = -1;

        double v[] = new double[1000000];

        for (int i = 1; i <= n; i++) {
            v[i] = Double.parseDouble(scanner.next());
        }

        for (int i = 1; i <= n; i++) {
            if (max < v[i]) {
                max = v[i];
                p = i;
            }
        }
        for (int j = (int) n; j >= 1; j--) {
            if (max2 < v[j]) {
                max2 = v[j];
                u = j;
            }
        }
        System.out.println((int)p + " " + (int)u);
    }
}
