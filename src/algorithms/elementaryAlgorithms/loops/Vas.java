package algorithms.elementaryAlgorithms.loops;

import java.util.Scanner;

//3062
public class Vas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        int y = sc.nextInt();
        int T = 0;

        while(x>y) {
            T = T+t;
            x = x - (x/4);
        }
        System.out.println(T);
    }
}

