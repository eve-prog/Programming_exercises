package algorithms.elementaryAlgorithms.fibo;
//423
import java.util.Scanner;

public class Fibonacci1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;

        if (n == 1) {
            System.out.println("1");
        } else {
            System.out.print(a + " " + b + " ");
            while (c <= n && a + b <= n) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}
