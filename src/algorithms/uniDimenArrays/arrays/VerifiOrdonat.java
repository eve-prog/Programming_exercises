package algorithms.uniDimenArrays.arrays;

import java.util.Scanner;

//500
public class VerifiOrdonat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] v = new int[502];

        for (int i = 1; i <= n; i++){
            v[i] = sc.nextInt();
        }
        int crescator = 1; //presupunem ca sunt ordonate crescator
        for (int p = 1; p <= n-1; p++){
            if(v[p] > v[p+1]){
                crescator = 0; //=> ca nu sunt ordonate crescator
            }
        }
        if (crescator == 1){
            System.out.println("DA");
        }else{
            System.out.println("NU");
        }
    }
}
