package algorithms.divideEtImpera;
//Suma elementelor dintr-un vector
import java.util.Scanner;

public class DivideEtImpera {

    public static int Suma(int V[], int st, int dr) {
        if (st == dr)
            return V[st]; // problemă elementară
        else {
            int m = (st + dr) / 2; // împărțim problema în subprobleme
            int s1 = Suma(V, st, m); // rezolvăm prima subproblemă
            int s2 = Suma(V, m + 1, dr); // rezolvăm a doua subproblemă
            return s1 + s2; // combinăm rezultatele
        }
    }
    public static void main(String[] args) {
        //citire n si V
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] V = new int[101];
        for (int i = 1; i <= n; i++) {
            V[i] = sc.nextInt();
        }
        System.out.print(Suma(V, 1, n));
    }
}
