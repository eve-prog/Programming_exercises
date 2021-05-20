package algorithms.divideEtImpera;

import java.util.Scanner;

//1015
public class SumVec {

    public static int suma(int v[], int st, int dr) {
        if (st == dr) {
            return v[st];
        } else {
            int m = (st + dr) / 2;
            int s1 = suma(v, st, m);
            int s2 = suma(v, m + 1, dr);
            return s1 + s2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] V = new int[1001];
        for (int i = 0; i < n; i++) {
            V[i] = sc.nextInt();
        }
        System.out.println(suma(V, 0, n));
    }
}
