package algorithms.elementaryAlgorithms.loops;

import java.util.Scanner;

//2572
public class PatratPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k;

        for (int i = 0; i < n; i++) {
            k = sc.nextLong();
            if (Math.sqrt(k) ==(int)Math.sqrt(k)) {
                System.out.println("DA");
            } else {
                System.out.println("NU");
            }
        }
    }
}

