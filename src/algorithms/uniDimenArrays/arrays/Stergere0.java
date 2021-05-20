package algorithms.uniDimenArrays.arrays;
//sa se stearga elementele egale cu 0 din vectorul citit

import java.util.Scanner;

public class Stergere0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] v = new int [1002];

        for (int i = 0; i <= n-1; i++) {
            v[i] = scanner.nextInt();
        }
        for (int p = n-1; p >= 0; p--){
            if (v[p] == 0){
                for (int i = p; i<=n-1; i++){
                    v[i]=v[i+1]; //v[i] se muta in stg lui
                }
                n--;
            }
        }
        for (int i = 0; i <= n-1; i++){
            System.out.print(v[i] + " ");
        }
    }
}
