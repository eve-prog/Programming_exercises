package meditatii.vectori;
//166

import java.util.Scanner;

public class InserareInainte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[54];

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (int p = n; p >= 1; p--) {
            if ((int) Math.sqrt(v[p]) == Math.sqrt(v[p])) {
                for (int i = n; i >= p + 1; i--) {
                    v[i + 1] = v[i];
                }
                v[p + 1] = (int) Math.sqrt(v[p]);
                n++;

                int aux = v[p + 1];
                v[p + 1] = v[p];
                v[p] = aux;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
