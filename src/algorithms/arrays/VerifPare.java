package algorithms.arrays;

import java.util.Scanner;

public class VerifPare {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]v = new int[102];
        int impare = 0;

        for(int i = 1; i <= n; i++){
            v[i] = sc.nextInt();
        }
        for(int i = 1; i <= n; i++){
            if(v[i] % 2 != 0){
                impare++;
            }
        }
        if (impare == 0){
            System.out.println("DA");
        }else{
            System.out.println("NU");
        }
    }
}

