package algorithms.elementaryAlgorithms.loops;

import java.util.Scanner;

//52
public class SumaPare1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        long s = 0;

        do {
            n = sc.nextLong();
            if (n % 2 == 0) {
                s += n;
            }
        }while (n!=0);

        System.out.println(s);
    }
}
