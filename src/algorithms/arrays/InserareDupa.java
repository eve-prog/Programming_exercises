package meditatii.vectori;
//159
import java.util.Scanner;

public class InserareDupa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vector = new int[52];
        int p,i;

        for (i = 1; i <= n; i++) {
            vector[i] = sc.nextInt();
        }
        for (p = n; p >= 1; p--) {
            if (vector[p] % 2 == 0) {
                for (i = n; i >= p+1; i--) {
                    vector[i + 1] = vector[i];
                }
                vector[p+1] = 2 * vector[p];
                n++;
            }
        }
        for (i = 1; i <= n; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}