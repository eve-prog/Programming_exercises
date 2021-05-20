package algorithms.uniDimenArrays.arrays;

import java.util.Scanner;

//sa se insereze intr-un sir inaintea fiecarui element impar patratul acestora
public class InserareInainte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int v[] = new int[1002];

        for (int i = 1; i <= n; i++){
            v[i] = scanner.nextInt();
        }
        for (int p = n; p >= 1; p--){
            if (v[p] % 2 != 0){
                for (int i = n; i >= p+1; i--){
                    v[i+1] = v[i];
                }
                v[p+1] = v[p] * v[p];
                n++;

                int aux = v[p+1];
                v[p+1] = v[p];
                v[p] = aux;
            }
        }
        for (int i = 1; i <= n; i++){
            System.out.print(v[i] + " ");
        }
    }
}
