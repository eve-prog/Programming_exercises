package algorithms.uniDimenArrays.interclassing;
//284
import java.util.Scanner;

public class Interclasare3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[100001];
        int[] b = new int[100001];
        int[] c = new int[200002];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }

        int i = 0, j = m-1 , k = 0;
        while (i < n && j >= 0) {
            if (a[i] < b[j]) {
                    c[k++] = a[i++];
            } else{
                    c[k++] = b[j--];
            }
        }

        while (i < n) {
            c[k++] = a[i++];
        }
        while (j >= 0) {
            c[k++] = b[j--];
        }

        for (int p = 0; p < n + m; p++) {
            if (c[p] % 2 == 0) {
                System.out.print(c[p] + " ");
            }
            if (p % 20 == 19) {
                System.out.println();
            }
        }
    }
}
