package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

//119
public class Ex15 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int x = -1;
        int y = -1;
        for (int i = 1; i <= n; i++) {
            int nr = myObj.nextInt();
            if (nr >= x) {
                y = x;
                x = nr;
            } else {
                if (nr > y) {
                    y = nr;
                }
            }
        }
        System.out.println(x + " " + y);
    }
}
