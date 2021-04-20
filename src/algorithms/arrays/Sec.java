package algorithms.arrays;

import java.util.Scanner;

public class Sec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[1010];
        for (int i = 1; i<=n; i++){
            x[i]= sc.nextInt();
        }
        int m = sc.nextInt();
        int y[] = new int[1010];
        for (int j = 1; j<=m; j++){
            y[j]= sc.nextInt();
        }
        int pozitia = 0; // presupunem de la inceput ca elem din y nu se regasesc in x
        int egalitati;
        for (int i = 1; i+m-1<=n;i++){
            egalitati = 0;
            for (int j = 1; j <= m; j++){
                if (y[j] == x[i + j - 1]) {
                    egalitati++;
                }
            }
            if (egalitati == m) {
                pozitia = i;
                break;
            }
        }
        if (pozitia == 0) {
            System.out.println("NU");
        } else {
            System.out.println(+pozitia);
        }
    }
}
