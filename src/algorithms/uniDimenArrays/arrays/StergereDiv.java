package algorithms.uniDimenArrays.arrays;

import java.util.Scanner;

//sa se stearga elementele divizibile cu 5 din vectorul citit, pornind de la 0
public class StergereDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v [] = new int[1002];

        for (int i = 0; i <= n-1; i++){
            v[i] = sc.nextInt();
        }

        for (int p = n-1; p >= 0; p--){
            if (v[p] % 5 == 0){
               for (int i = p; i<=n-1; i++){
                   v[i] = v[i+1];
               }
               n--;
            }
        }
        for (int i = 0; i<=n-1; i++){
            System.out.println(v[i] + " ");
        }
    }
}
