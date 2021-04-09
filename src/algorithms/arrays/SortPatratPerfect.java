package meditatii.vectori;
//183

import java.util.Scanner;

public class SortPatratPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];
        int[] a = new int[1001];

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
            if ((int) Math.sqrt(v[i]) == Math.sqrt(v[i])) {
                a[i] = 1; //este adevarat ca v[i] este patrat perfect;
            }else{
                a[i] = 0;//este fals ca v[i] este patrat perfect
            }//memoreaza cu 1 daca v[i] este pp si cu 0 daca v[i] nu e pp in vectorul a[]
        }
        for (int k = 1; k <= n; k++) {
            for (int j = k + 1; j <= n; j++) {
                if (v[k] > v[j] && a[k] + a[j] == 2) {
                    int aux = v[k];
                    v[k] = v[j];
                    v[j] = aux;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(v[i] + " ");
        }
    }
}