package algorithms.mArrays.mArrays;

import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A [][] = new int[1000][1000];

        //citire linii si coloane
        int n = sc.nextInt();
        int m = sc.nextInt();

        //citire matrice
        for (int i = 0; i < n; i++){ //linia i
            for (int j = 0; j < m; j++){ //linia j
                A[i][j] = sc.nextInt();
            }
        }

        //afisare matrice
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++){
            int S = 0;
            for (int j = 0; j < m; j++){
                S = S + A[i][j];
            }
            System.out.print(S + " ");
        }
    }
}
