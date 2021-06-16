package algorithms.uniDimenArrays.sequenceArrays;
//578

import java.util.Scanner;

public class SecventeEgale2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[100001];
        long C = 0;
        int i,j;

        for (i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (i = 1; i <= n; i++) {
            long d = 0;
            int p = n + 1;
            for (j = i; j <= n; j++) {
                if (v[i] == v[j]) {
                    d++;
                }else{
                    p = j;
                    break;
                }
            }
            C = C + d * (d+1) / 2;
            i = p - 1;
        }
        System.out.println(C);
    }
}
