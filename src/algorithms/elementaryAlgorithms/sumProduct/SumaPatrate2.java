package algorithms.elementaryAlgorithms.sumProduct;

import java.util.Scanner;
//47
public class SumaPatrate2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int S = 0;

        for (int i = 1; i <= n; i++){
            S = S + i*i;
        }
        System.out.println(S);
    }
}
