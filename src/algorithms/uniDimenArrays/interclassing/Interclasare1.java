package algorithms.uniDimenArrays.interclassing;
//250
import java.util.Scanner;

public class Interclasare1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[10001];
        int[] b = new int[10001];
        int[] c = new int[10001];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int i = 0, j = 0;
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
            if (p % 10 == 9) {
                System.out.println();
            }
        }
    }
}

