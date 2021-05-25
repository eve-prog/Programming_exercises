package algorithms.uniDimenArrays.interclassing;
//2668

import java.util.Scanner;

public class Comun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[100001];
        int[] b = new int[100001];
        int[] c = new int[100001];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        int l = 0;
        int m = 0;

        while (i < n && j < n && l < n) {
            if (a[i] == b[j] && b[j] == c[l]) {
                System.out.println(a[i]);
                m++;
                break;
            } else {
                int vmin = a[i];
                if (b[j] < vmin) {
                    vmin = b[j];
                }
                if (c[l] < vmin) {
                    vmin = c[l];
                }
                if (a[i] == vmin) {
                    i++;
                }
                if (b[j] == vmin) {
                    j++;
                }
                if (c[l] == vmin) {
                    l++;
                }
            }
        }

        if (m == 0) {
            System.out.println(-1);
        }
    }
}