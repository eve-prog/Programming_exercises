package algorithms.elementaryAlgorithms.loops;
//3166
import java.util.Scanner;

public class Vas1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long t = sc.nextLong();
        long y = sc.nextLong();
        long i = sc.nextLong();
        long T = 0;

        while (x > y) {
            T = T + t;
            x = x - x/i;
        }
        System.out.println(T);
    }
}
