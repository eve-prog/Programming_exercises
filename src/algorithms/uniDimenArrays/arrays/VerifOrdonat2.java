package algorithms.uniDimenArrays.arrays;

import java.util.Scanner;

public class VerifOrdonat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] v = new int[502];


        for (int i = 1; i <= n; i++){
            v[i] = sc.nextInt();
        }
        int crescator = 1;
        for (int p = 1; p <= n-1; p++){
            for(int j = p+1; j <= n; j++){
                if(v[p] > v[j]){
                    crescator = 0;
                }
            }
        }
        if (crescator == 1){
            System.out.println("DA");
        }else{
            System.out.println("NU");
        }
    }
}


