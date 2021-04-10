package meditatii.pbInfo;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b = myObj.nextInt();

        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        if (a == 0 && b == 0) {
            System.out.println(-1);
        } else {
            System.out.println(a);

        }
    }
}