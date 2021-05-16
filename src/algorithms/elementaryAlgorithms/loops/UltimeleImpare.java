package algorithms.elementaryAlgorithms.loops;
//246
import java.util.Scanner;

public class UltimeleImpare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, nr;
        n = sc.nextInt();;
        int c = 0;

        do {
            nr = sc.nextInt();
            if (nr % 2 != 0) {
                c++;
                System.out.print(nr + " ");
            }
        }while (n!=0);
        if (c == 0) {
            System.out.println("Numere insuficiente");
        }
    }
}
