package algorithms.elementaryAlgorithms.controlFlow;

import java.util.Scanner;

public class MinMax2 {

    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b = myObj.nextInt();

        int a1 = a / 100;
        int a2 = a / 10 % 10;
        int a3 = a % 10;

        int b1 = b / 100;
        int b2 = b / 10 % 10;
        int b3 = b % 10;

        int max;
        max = a1;
        if (a2 > max) {
            max = a2;
        }
        if (a3 > max) {
            max = a3;
        }

        int min;
        min = a1;
        if (a2 < min) {
            min = a2;
        }
        if (a3 < min) {
            min = a3;
        }

        int maxb;
        maxb = b1;
        if (b2 > maxb) {
            maxb = b2;
        }
        if (b3 > maxb) {
            maxb = b3;
        }

        int minb;
        minb = b1;
        if (b2 < minb) {
            minb = b2;
        }
        if (b3 < minb) {
            minb = b3;
        }

        int minf, maxf;
        if (max > maxb ) {
            maxf = max * 10 + maxb;
        } else {
            maxf = maxb * 10 + max;
        }

        if (minb > min && min>0) {
            minf = min * 10 + minb;
        } else {
            minf = minb * 10 + min;
        }


        System.out.println(maxf + " " + minf);


    }

}


