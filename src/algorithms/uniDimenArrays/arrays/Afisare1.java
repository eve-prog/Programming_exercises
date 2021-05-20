package algorithms.uniDimenArrays.arrays;
import java.util.Scanner;
//489
public class Afisare1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int v[] = new int[1002];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            System.out.print(v[i] + " ");
            if (i < j) {
                System.out.print(v[j] + " ");
            }
        }
    }
}
