package algorithms.elementaryAlgorithms.sumProduct;
//48
import java.util.Scanner;

public class SumaPatrate1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int S = 0;
        int i = 1;

        while (i * i <= n) {
            S = S + i * i;
            i++;
        }
        System.out.println(S);
    }
}
