package algorithms.uniDimenArrays.sequenceArrays;

import java.util.Scanner;

public class SecvMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];
        int st = 0;
        int dr = 1;
        int Smax = -2000000000, S;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                S = 0;
                for (int k = i; k <= j; k++) {
                    if (v[k] % 2 == 0) {
                        S += v[k];
                    }else{
                        k = j;
                    }
                }
                if (S > Smax) {
                    Smax = S;
                    st = i;
                    dr = j;
                }
            }
        }
        System.out.println(st + " " + dr);
    }
}
