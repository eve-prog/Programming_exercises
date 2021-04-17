package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;
//3666
public class Ex10 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int nrImparDeDivizori = 0;

        for (int d = 1; d * d <= n; d++) {
            if (n % d == 0) {
                nrImparDeDivizori++;
            }
            if (n % (n/d) == 0){
                nrImparDeDivizori++;
            }
            if (d*d == n){
                nrImparDeDivizori--;
            }
        }
        if (nrImparDeDivizori % 2 != 0){
            System.out.println("da");
        }else{
            System.out.println("nu");
        }
    }
}

