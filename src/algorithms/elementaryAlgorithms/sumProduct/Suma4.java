package algorithms.elementaryAlgorithms.sumProduct;

import java.util.Scanner;

//943
public class Suma4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] S = new int[11];
        S[0] = 0;
        int r = 0;

        for (int i = 1; i <= 10; i++) {
            int j = i % 10;
            S[i] = (S[i-1] + j*j*j*j)%10;
        }
        r = (n/10) * S[10] % 10;
        r = r + S[n%10];
        r = r % 10;
        System.out.println(r);
    }
}