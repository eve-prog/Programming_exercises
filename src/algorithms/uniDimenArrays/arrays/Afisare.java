package algorithms.uniDimenArrays.arrays;
//546
import java.util.Scanner;

public class Afisare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1000];
        int i;

        for (i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (i = 1; i <= n; i++) {
            if (v[i] % v[n] == 0) {
                System.out.print(v[i] + " ");
            }
        }
    }
}