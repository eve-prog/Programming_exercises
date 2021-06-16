package algorithms.uniDimenArrays.sequenceArrays;

import java.util.Scanner;

public class SumSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[1001];
        int prim;
        int s = 0;
        int p1 = 0, p2 = 0;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 1; i <= v[i]; i++) {
            prim = 1;
            for (int d = 2; d * d <= v[i]; d++) {
                if (v[i] % d == 0) {
                    prim = 0;
                }

                for (int j = i; j <= n; j++) {
                    if (prim == 1 && v[i] >= 2) {
                        p1 = j;
                        break;
                    }
                }
                for (int j = n; j >= 1; j--) {
                    if (prim == 1 && v[i] >= 2) {
                        p2 = j;
                        break;
                    }
                }
            }
        }
        for (int i = p1; i <= p2; i++) {
            s = s + v[i];
        }

        System.out.println(s);
    }
}
