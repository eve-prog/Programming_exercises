package algorithms.arrays;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[502];
        int ok;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        //ordonam crescator vectorul
        //bubblesort
        do {
            ok = 1; // presupunem ca vectorul este ordonat
            for (int i = 1; i <= n - 1; i++) {
                if (v[i] > v[i + 1]) {
                    ok = 0;

                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;

                }
            }
        } while (ok == 0);

        for (int i = 1; i <= n; i++){
            System.out.print(v[i] + " ");
        }
    }
}
