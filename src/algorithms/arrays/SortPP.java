package meditatii.vectori;

import java.util.Scanner;

public class SortPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (int k = 1; k <= n; k++) {
            if ((int) Math.sqrt(v[k]) == Math.sqrt(v[k])) {
                for (int j = k + 1; j <= n; j++) {
                    if ((int) Math.sqrt(v[j]) == Math.sqrt(v[j])) {
                        if (v[k] > v[j]) {
                            int aux = v[k];
                            v[k] = v[j];
                            v[j] = aux;
                        }
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(v[i] + " ");
        }
    }
}

