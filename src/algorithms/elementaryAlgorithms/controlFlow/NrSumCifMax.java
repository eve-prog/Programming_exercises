package algorithms.elementaryAlgorithms.controlFlow;

import java.util.Scanner;

//3275
public class NrSumCifMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = -1;

        int x = a / 10 + a % 10;
        int y = b / 10 + b % 10;
        int z = c / 10 + c % 10;

        if (x > max) {
            max = x;
        }
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        if (max == x) {
            System.out.print(a + " ");
        }
        if (max == y) {
            System.out.print(b + " ");
        }
        if (max == z) {
            System.out.print(c + " ");
        }
    }
}

