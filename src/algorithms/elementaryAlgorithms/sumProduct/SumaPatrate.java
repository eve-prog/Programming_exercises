package algorithms.elementaryAlgorithms.sumProduct;
//1212
import java.util.Scanner;

public class SumaPatrate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int S = 0;

        for (int i = 1; i <= n; i++){
            S = (int) (S + Math.pow(i,2));
        }
        System.out.println(S);
    }
}
