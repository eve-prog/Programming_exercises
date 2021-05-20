package algorithms.uniDimenArrays.arrays;
//1453
import java.util.Scanner;

public class Stergere2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vector[] = new int[1000];

        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextInt();
        }
        for (int p = n - 1; p >= 0; p--) {
            if (vector[p] % 2 == 0) {
                for (int i = p; i < n - 1; i++) {
                    vector[i] = vector[i + 1];
                }
                n--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
