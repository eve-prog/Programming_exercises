package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int nr;
        int S = 0;
        for (int i = 1; i <= n; i++){
            nr = myObj.nextInt();
            S = S + nr;
        }
        System.out.println(S);
    }
}
