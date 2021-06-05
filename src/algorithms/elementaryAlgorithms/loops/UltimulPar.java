package algorithms.elementaryAlgorithms.loops;
//326
import java.util.Scanner;

public class UltimulPar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int n = sc.nextInt();
        int ultim = 0;
        int c = 0;


        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            if (x % 2 == 0) {
                c++;
                ultim = x;
            }
        }

        if (c==0){
            System.out.println("IMPOSIBIL");
        }else{
            System.out.println(ultim);
        }
    }
}
