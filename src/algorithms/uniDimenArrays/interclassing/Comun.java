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
        int[] d = new int[200002];
        int[] e = new int[200002];
        int[] f = new int[200002];
        int[] g = new int[200002];

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

        while (i < n && j < n) {
            if (a[i] < b[j]) {
                d[l++] = a[i++];
            } else if (a[i] > b[j]) {
                d[l++] = b[j++];
            } else {
                e[m++] = a[i++];
            }
        }
        while (i < n) {
            d[l++] = a[i++];
        }
        while (j < n) {
            d[l++] = b[j++];
        }

        int j1 = 0;
        int k = 0;
        int l1 = 0;
        int m1 = 0;

        while (j1 < n && k < n) {
            if (b[j1] < c[k]) {
                f[l1++] = b[j1++];
            } else if (b[j1] > c[k]) {
                f[l1++] = c[k++];
            } else {
                g[m1++] = c[k++];
            }
        }
        while (j1 < n) {
            f[l1++] = b[j1++];
        }
        while (k < n) {
            f[l1++] = c[k++];
        }

        int e1 = 0;
        int g1 = 0;
        while (e1 < n && g1 < n) {
            if (e[e1] == g[g1]){
                System.out.println(e[e1]);
                break;
            }else{
                System.out.println(-1);
            }
        }
    }
}
