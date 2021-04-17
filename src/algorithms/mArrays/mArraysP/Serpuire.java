package algorithms.mArrays.mArraysP;

import java.util.Scanner;

//794
public class Serpuire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[26][26];
        int i, j, k;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (k = 2; k <= 2 * n; k++) {
            //cautam capatul de pornire al diagonalei cu suma k
            if (k % 2 == 0) {
                // par -> coborare; coboram din linia 1 sau coloana n
                if (k <= n + 1) {
                    i = 1;
                    j = k - i;
                    while (i <= n && j >= 1) {
                        System.out.print(a[i][j] + " ");
                        i++;
                        j--;
                    }
                } else {
                    j = n;
                    i = k - j;
                    while (i <= n && j >= 1) {
                        System.out.print(a[i][j] + " ");
                        i++;
                        j--;
                    }
                }
            } else {
                //impar -> urcare; urcam din coloana 1 sau linia n
                if (k <= n + 1) {
                    j = 1;
                    i = k - j;
                    while (i >= 1 && j <= n) {
                        System.out.print(a[i][j] + " ");
                        i--;
                        j++;
                    }
                } else {
                    i = n;
                    j = k - i;
                    while (i >= 1 && j <= n) {
                        System.out.print(a[i][j] + " ");
                        i--;
                        j++;
                    }
                }
            }

        }
    }
}
