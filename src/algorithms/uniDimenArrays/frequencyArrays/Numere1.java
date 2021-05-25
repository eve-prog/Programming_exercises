package algorithms.uniDimenArrays.frequencyArrays;

import java.util.Scanner;

public class Numere1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[500001];
        int[] vp = new int[1001];

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            if (v[i] / 1000 == 0){
                System.out.print(v[i] + " ");
            }
        }
    }
}
