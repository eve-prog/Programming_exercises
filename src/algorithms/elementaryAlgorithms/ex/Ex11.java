package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int D = 0;
        int ogl = 0;

        while (n!=0) {
            ogl = 10 * ogl + n % 10;
            n = n / 10;
        }

        for (int d = 1; d * d <= ogl; d++){
            if (ogl % d == 0){
                D++;
            }
            if (ogl % (ogl/d) == 0){
                D++;
            }
            if (d * d == ogl){
                D--;
            }
        }
        System.out.println(D);
    }
}
