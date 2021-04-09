package meditatii.vectori;

import java.util.Scanner;

public class Numere1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];
        int ok;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        do {
            ok = 1;
            for (int i = 1; i <= n - 1; i++) {
                if (v[i] > v[i + 1]) {
                    ok = 0;
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                }
            }
        } while (ok == 0);


        for (int i = 1; i <= n; i++) {
            if (v[i] / 1000 == 0){
                System.out.println(v[i]);
            }
        }

    }
}
