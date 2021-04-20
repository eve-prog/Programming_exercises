package algorithms.arrays;
//516

import java.util.Scanner;

public class SumSec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        int i1 = 0; //inca nu a fost gasit primul nr impar
        int i2 = 0; //inca nu a fost gasit ultimul nr impar

        for (int i = 1; i <= n; i++){
            if (v[i] % 2 == 1){
                i1 = i;
                break;
            }
        }
        for(int i = n; i>=1; i--){
            if (v[i] % 2 == 1){
                i2 = i;
                break;
            }
        }
        int S = 0;
        for (int i = i1; i <= i2; i++) {
            S = S + v[i];
        }
        System.out.println(S);
    }
}
