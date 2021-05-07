package algorithms.multiDimenArrays.multiDimArrays;

import java.util.Scanner;

//778
public class MChenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[][] = new int[102][102];
        int B[] = new int[100];
        int count = 0;
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        // construim vectorul care contine elementele de pe marginea matricei:
        // prima linie
        for (j = 1; j <= m; j++) {
            B[count++] = A[1][j];
        }
        // ultima coloana
        for (i = 2; i <= n; i++) {// pornim de la 2 deoarece elementul din dreapta sus l-am luat in considerare in for-ul anterior
            B[count++] = A[i][m];
        }
        // ultima linie
        for (j = 1; j < m; j++) { // mergem pana la coloane - 1 deoarece elementul din dreapta jos l-am luat in considerare in for-ul anterior
            B[count++] = A[n][j];
        }
        //prima coloana
        for (i = 1; i < n; i++) { // elementele din stanga sus si stanga jos le-am luat in considerare mai sus
            B[count++] = A[i][1];
        }
        // sortam crescator vectorul
        for (i = 1; i < count; i++) {
            for (j = i + 1; j <= count; j++) {
                if (B[i] > B[j]) {
                    int aux = B[i];
                    B[i] = B[j];
                    B[j] = aux;
                }
            }
        }
        // si acum le afisam pe restul, cu conditia ca acestea sa nu fie egale cu cele dinainea lor (sa nu afisam acelasi numar de doua ori)
        for (i = 2; i <= count; i++) {
            if (B[i] != B[i + 1]) {
                System.out.print(B[i] + " ");
            }
        }
    }
}
