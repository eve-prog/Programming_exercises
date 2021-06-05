package algorithms.elementaryAlgorithms.loops;
//459

import java.util.Scanner;

public class Suma1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int tmp = 0;
        while (true) {
            int a = tmp;
            tmp = sc.nextInt();
            s += tmp;
            if (tmp == a) {
                break;
            }
        }
        System.out.println(s);
    }
}

