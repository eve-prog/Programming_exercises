package algorithms.elementaryAlgorithms.loops;
//339
import java.util.Scanner;

public class Numere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nr;
        int P = -1;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            nr = scanner.nextInt();
            if (nr % 2 == 0) {
                count++;
                P = nr;
                System.out.println(P);
                break;
            }
        }
        if (count == 0) {
            System.out.println("IMPOSIBIL");
        }
    }
}

