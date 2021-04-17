package algorithms.elementaryAlgorithms.controlFlow;
//1301

import java.util.Scanner;

public class Isoscel {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double a = Double.parseDouble(myObj.next());
        double b = Double.parseDouble(myObj.next());
        double c = Double.parseDouble(myObj.next());

        if (a + b > c && a + c > b && b + c > a) {
            if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
                System.out.println("Formeaza triunghi isoscel");
            } else {
                System.out.println("Nu formeaza triunghi isoscel");
            }
        } else {
            System.out.println("Nu formeaza triunghi");
        }
    }
}


