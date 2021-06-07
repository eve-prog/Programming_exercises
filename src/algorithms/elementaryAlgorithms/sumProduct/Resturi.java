package algorithms.elementaryAlgorithms.sumProduct;
//974
import java.util.Scanner;

public class Resturi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long S = 0;
        long m;
        int i = 0;

        while (i <= n){
            m = i % k;
            S = S + m;
            i++;
        }
        System.out.println(S);
    }
}
