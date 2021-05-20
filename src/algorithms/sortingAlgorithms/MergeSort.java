package algorithms.sortingAlgorithms;
//1025

import java.util.Scanner;

public class MergeSort {

    static int[] v = new int[10001];
    static int[] tmp = new int[10001];

    public static void mergeSort(int st, int dr) {
        if (st < dr) {
            int m = (st + dr) / 2;

            mergeSort(st, m);
            mergeSort(m + 1, dr);

            int i = st, j = m + 1, k = 0;
            while (i <= m && j <= dr) {
                if (v[i] < v[j]) {
                    tmp[++k] = v[i++];
                } else {
                    tmp[++k] = v[j++];
                }
            }
            while (i <= m) {
                tmp[++k] = v[i++];
            }
            while (j <= dr) {
                tmp[++k] = v[j++];
            }
            for (i = st, j = 1; i <= dr; i++, j++) {
                v[i] = tmp[j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        mergeSort(0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
    }
}


