package algorithms.uniDimenArrays.sequenceArrays;

import java.util.Scanner;

public class KSecventa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];
        int k = sc.nextInt();
        int st = 0;
        int dr = 0;
        int ok = 0; //presupunem ca nu exista
        int ok1;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 1; i + k <= n; i++) {
            for (int j = i + 1; j + k - 1 <= n; j++) {
                ok1 = 0;
                for (int l = 0; l <= k - 1; l++) {
                    if (v[i + l] == v[j + l]) {
                        ok1++;
                    }
                }
                if (ok1 == k) {
                    ok = 1;
                    st = i;
                    dr = j;
                    j = n;
                    i = n;
                }
            }
        }
        if (ok == 0) {
            System.out.println("NU");
        } else {
            System.out.println(st + " " + dr);
        }
    }
}
