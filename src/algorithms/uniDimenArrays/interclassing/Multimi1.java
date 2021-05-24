package algorithms.uniDimenArrays.interclassing;
//530
import java.util.Scanner;

public class Multimi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100001];
        int[] b = new int[100001];
        int[] c = new int[200002];
        int[] d = new int[200002];
        int[] e = new int[200002];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else if (a[i] > b[j]) {
                c[k++] = b[j++];
            } else {
                c[k++] = a[i++];
                j++;
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
        for (int p = 0; p < k; p++) {
            System.out.print(c[p] + " ");
        }
        System.out.println();

        int i1 = 0;
        int j1 = 0;
        int k1 = 0;
        int l1 = 0;


        while (i1 < n && j1 < m && l1 < m+n) {
            if (a[i1] < b[j1]) {
                d[l1++] = a[i1++];
            } else if (a[i1] > b[j1]) {
                d[l1++] = b[j1++];
            } else {
                e[k1++] = a[i1++];
                j1++;
            }
        }
        while (i1 < n) {
            d[l1++] = a[i1++];
        }
        while (j1 < m) {
            d[l1++] = b[j1++];
        }
        for (int p = 0; p < k1; p++) {
            System.out.print(e[p] + " ");
        }

    }
}

