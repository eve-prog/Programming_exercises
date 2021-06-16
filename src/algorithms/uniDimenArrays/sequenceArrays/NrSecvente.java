package algorithms.uniDimenArrays.sequenceArrays;
//862

import java.util.Scanner;

public class NrSecvente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();
        int[] v = new int[100001];
        int C = 0;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            if(v[i]<=t){
                int d = 0;
                int p = n +1;
                for (int l = i; l <= n; l++) {
                    if (v[l] <= t) {
                        d++;
                    }else{
                        p = l;
                        break;
                    }
                }
                if(d >= k){
                    C = C + (d-k+1);
                }
                i = p -1;
            }
        }
        System.out.println(C);
    }
}
