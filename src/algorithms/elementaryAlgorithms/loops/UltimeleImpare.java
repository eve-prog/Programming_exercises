package algorithms.elementaryAlgorithms.loops;
//246

import java.util.Scanner;

public class UltimeleImpare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int n = sc.nextInt();
        int ultim = 0, penultim = 0;


        for (int i = 1; i<=n; i++){
            x = sc.nextInt();
            if (x % 2 != 0) {
                penultim = ultim;
                ultim = x;
            }
        }
        if (penultim == 0 || ultim == 0) {
            System.out.println("Numere insuficiente");
        }else{
            System.out.println("" + penultim + " " + ultim);
        }
    }
}
