package algorithms.uniDimenArrays.arrays;

import java.util.Scanner;

public class AfisarePRIME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[202];
        int prim;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            prim = 1; //true
            //verificam daca are mai multi divizori => nu este prim
            for (int d = 2; d * d <= v[i]; d++) {
                if (v[i] % d == 0) {
                    prim = 0; //false
                }
            }
            if(prim == 1 && v[i] >= 2){
                System.out.print(v[i] + " ");
            }
        }
    }
}


