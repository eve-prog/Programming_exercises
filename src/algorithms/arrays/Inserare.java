package algorithms.arrays;

import java.util.Scanner;
//158
public class Inserare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vector = new int[26];
        int X = sc.nextInt();
        int p = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            vector[i] = sc.nextInt();
        }

        for (int i = n; i >= p; i--) {
            vector[i + 1] = vector[i]; // vector[i] se muta in dreapta lui
        }
        vector[p] = X;
        n++;

        for (int i = 1; i <= n; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}

