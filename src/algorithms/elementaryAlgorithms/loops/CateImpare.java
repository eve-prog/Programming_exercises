package algorithms.elementaryAlgorithms.loops;
//53
import java.util.Scanner;

public class CateImpare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int c = 0;

        do {
            n = sc.nextInt();
            if (n % 2 != 0) {
                c++;
            }
        }while (n!=0);
        System.out.println(c);
    }
}
