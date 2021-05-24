package algorithms.uniDimenArrays.interclassing;
//251
import java.util.Scanner;

public class Interclasare2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[10001];
        int[] b = new int[10001];
        int[] c = new int[20001];
        int[] d = new int[20001];


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
        int l = 0;

        while (i < n && j < m && l < m+n) {
            if (a[i] < b[j]) {
                d[l++] = a[i++];
            } else if (a[i] > b[j]) {
                d[l++] = b[j++];
            } else {
                c[k++] = a[i++];
                j++;
            }
        }
        while (i < n) {
            d[l++] = a[i++];
        }
        while (j < m) {
            d[l++] = b[j++];
        }
        for (int p = 0; p < k; p++) {
            System.out.print(c[p] + " ");
            if (p % 10 == 9) {
                System.out.println();
            }
        }
    }
}
