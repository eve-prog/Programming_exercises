package algorithms.elementaryAlgorithms.loops;
//459
import java.util.Scanner;

public class Suma1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int s = 0;
        do {
            n = sc.nextInt();
            if (n!=0) {
                s += n;
            }
        }while (n!=0);

        System.out.println(s);
    }
}
