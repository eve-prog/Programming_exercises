package algorithms.uniDimenArrays.arrays;
//290

import java.util.Scanner;

public class PareOrdonate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[102];
        int ok;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        ok = 1;
        for(int i = 1; i<=n-1; i++){
            for(int j = i+1; j <= n; j++){
                if(v[i] % 2 == 0 && v[j] % 2 == 0 && v[i] > v[j]){
                    ok = 0;
                }
            }
        }
        if (ok == 1) {
            System.out.println("DA");
        } else {
            System.out.println("NU");
        }
    }
}
