package algorithms.uniDimenArrays.interclassing;

import java.util.Scanner;

public class InterclassM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int[] a = new int[100001];
        int[] b = new int[100001];
        int[] c = new int[200002];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }

        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (a[i] % x == 0) {
                    c[k++] = a[i++];
                } else {
                    i++;
                }
            } else {
                if (b[j] < a[i]) {
                    if (b[j] % x == 0) {
                        c[k++] = b[j++];
                    } else {
                        j++;
                    }
                } else {
                    i++;
                    j++;
                }
            }
        }
        while (i < n) {
            if (a[i] % x == 0) {
                c[k++] = a[i++];
            } else {
                i++;
            }
        }
        while (j < m) {
            if (b[j] % x == 0) {
                c[k++] = b[j++];
            } else {
                j++;
            }
        }

        for (int p = 0; p < k; p++) {
            System.out.print(c[p] + " ");
        }
    }

}
