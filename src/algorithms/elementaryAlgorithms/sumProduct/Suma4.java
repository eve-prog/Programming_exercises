package algorithms.elementaryAlgorithms.sumProduct;

import java.util.Scanner;

//943
public class Suma4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int S = 0;
        int ultima;

        for (int i = 1; i <= n; i++) {
            S = (int) (S + Math.pow(i, 4));
        }
        ultima = S % 10;
        System.out.println(ultima);
    }
}
