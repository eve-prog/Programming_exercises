package algorithms.arrays;
//1452

import java.util.Scanner;

public class StergereElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[1501];
        int p = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = p; i < n; i++)
            x[i] = x[i + 1];
        n--;

        for (int i = 1; i <= n; i++) {
            System.out.print(x[i] + " ");
        }

    }

}