package algorithms.sortingAlgorithms;
//1024

import java.util.Scanner;

public class QuickSort {

    static int[] v = new int[100001];

    public static void quickSort(int v[], int st, int dr) {
        if (st < dr) {
            //pivotul este inițial v[st]
            int m = (st + dr) / 2;
            int aux = v[st];
            v[st] = v[m];
            v[m] = aux;
            int i = st, j = dr, d = 0;
            while (i < j) {
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                    d = 1 - d;
                }
                i += d;
                j -= 1 - d;
            }
            quickSort(v, st, i - 1);
            quickSort(v, i + 1, dr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        quickSort(v, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
