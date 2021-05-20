package algorithms.uniDimenArrays.arrays;
import java.util.Scanner;
//487
public class Numarare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int media = 0;
        int elemente = 0;
        int S = 0;

        int[] v = new int[202];
        for (i = 0; i < n; i++) {
            v[i] = sc.nextInt();

            S = S + v[i];
            media = S / n;
        }
        for (i = 0; i <= n; i++) {
            if (v[i] > media) {
                elemente++;
            }
        }
        System.out.println(elemente);
    }
}