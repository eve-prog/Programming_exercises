package algorithms.mArrays.mArrays;
// Să se determine cea mai mare valoare care apare în matrice de cel puțin două ori.
import java.util.Scanner;

public class Max2ap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int A[][] = new int[102][102];
        int v[] = new int[1000001];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = -1;
        int f;
        for (int i = 0; i <= 1000000; i++) {
            v[i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                //    A[i][j] = sc.nextInt();
                f = sc.nextInt();
                v[f]++;
            }
        }
        for (int i = 1000000; i >= 0; i--) {
            if (v[i] >= 2) {
                max = i;
                break;
            }
        }
        if (max != -1) {
            System.out.println(max);
        } else {
            System.out.println("IMPOSIBIL");
        }
    }
}
//Determinăm pentru fiecare valoare din matrice numărul de apariții, adică frecvența.
//Pentru aceasta, folosim vectorii v[] – valorile și f[] – frecvențele.
//Pentru fiecare valoare din matrice, o căutăm în vectorul v[].
//Dacă nu o găsim, o adăugăm și îi stabilim frecvența 1, iar dacă o găsim îi mărim frecvența.
//Determinăm maximul valorilor din v[] pentru care valoare corespunzătoare din f[] este cel puțin 2.
//Dacă găsim cel puțin o asemenea valoare, afișăm maximul, dacă nu afișăm mesajul precizat.

