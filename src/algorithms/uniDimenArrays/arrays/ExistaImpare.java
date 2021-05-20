package algorithms.uniDimenArrays.arrays;
//289
import java.util.Scanner;

public class ExistaImpare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vector = new int[n + 2];
        int i;
        int contor = 0;

        for (i = 1; i <= n; i++) {
            vector[i] = sc.nextInt();
        }

        for (i = 1; i <= n; i++) {
            if (vector[i] % 2 != 0) {
                contor++;
            }
        }
        if (contor == 0) {
            System.out.println("NU");
        } else {
            System.out.println("DA");
        }
    }
}
