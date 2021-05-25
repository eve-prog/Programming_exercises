package algorithms.divideEtImpera;

import java.util.Scanner;

public class SumPareVec {

    public static int sum(int v[], int st, int dr) {
        if (st == dr) {
            return v[st];
        } else {
            int s = 0;
            int m = (st + dr) / 2;
            int s1 = sum(v, st, m);
            int s2 = sum(v, m + 1, dr);

            if (s1 % 2 == 0 && s2 % 2 == 0) {
                return s = s1 + s1;
            }
            if (s2 % 2 == 0) {
                return s = s + s2;
            }
            if (s1 % 2 == 0) {
                return s = s + s1;
            }
        }
        return st;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];
        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        System.out.println(sum(v, 1, n));
    }
}
