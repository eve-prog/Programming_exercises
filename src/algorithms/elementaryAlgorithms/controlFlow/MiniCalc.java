package algorithms.elementaryAlgorithms.controlFlow;

import java.util.Scanner;

//450
public class MiniCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && b != 0 && c == 1) {
            System.out.println(a + b);
        } else if (a >= b && b != 0 && c == 2) {
            System.out.println(a - b);
        } else if (a >= b && b != 0 && c == 3) {
            System.out.println(a * b);
        } else if (a >= b && b != 0 && c == 4) {
            System.out.println(a / b);
        } else if (a >= b && b != 0 && c == 5) {
            System.out.println(a % b);
        }
    }
}
