package algorithms.uniDimenArrays.sequenceArrays;

import java.util.Scanner;

//524
public class SecventeEgale1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];
        int lmax = 0;
        int st = 0;
        int dr = 0;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j + 1 <= n; j++) {
                 if (v[i] == v[j]){
                     if (j - i + 1 > lmax) {
                         lmax = j - i + 1;
                         st = i;
                         dr = j;
                     }
                 }
            }
        }
        System.out.println(st + " " + dr);
    }
}
