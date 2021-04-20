package algorithms.elementaryAlgorithms.loops;

import java.util.Scanner;

//1376
public class LaturiTriunghi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }
}


