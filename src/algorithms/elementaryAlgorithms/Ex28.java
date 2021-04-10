package meditatii.pbInfo;

import java.util.Scanner;

public class Ex28 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int c;
        int max = -1;
        int a = 0;

        do {
            c = n % 10;
            n = n / 10;
            if (c > max) {
                max = c;
                a = 1;
            } else if (c == max) {
                a++;
            }
        }while (n != 0);
        System.out.print(max + " " + a);
    }
}


