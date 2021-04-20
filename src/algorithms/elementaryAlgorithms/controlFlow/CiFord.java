package algorithms.elementaryAlgorithms.controlFlow;

import java.util.Scanner;

//448
public class CiFord {

    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();

        int a1 = a / 100;
        int a2 = a / 10 % 10;
        int a3 = a % 10;

        if (a1 <= a2 && a1 <= a3 && a2 <= a3) {
            System.out.println(a1 + " " + a2 + " " + a3);
        } else if (a1 <= a3 && a1 <= a2 && a3 <= a2) {
            System.out.println(a1 + " " + a3 + " " + a2);
        } else if (a2 <= a1 && a2 <= a3 && a1 <= a3) {
            System.out.println(a2 + " " + a1 + " " + a3);
        } else if (a2 <= a1 && a2 <= a3 && a1 <= a3) {
            System.out.println(a2 + " " + a1 + " " + a3);
        } else if (a2 <= a3 && a2 <= a1 && a3 <= a1) {
            System.out.println(a2 + " " + a3 + " " + a1);
        }else if (a3 <= a1 && a1 <= a2 && a3 <= a2) {
            System.out.println(a3 + " " + a1 + " " + a2);
        } else if (a3 <= a2 && a3 <= a1 && a2 <= a1) {
            System.out.println(a3 + " " + a2 + " " + a1);
        }
    }
}
