package algorithms.elementaryAlgorithms.controlFlow;

import java.util.Scanner;

public class Melc {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double v = Double.parseDouble(myObj.next());
        int d = Integer.parseInt(myObj.next());
        v = v * 1000 / 60;
        double t =(d+v-1) / v;
        System.out.println((int) t);
    }
}
