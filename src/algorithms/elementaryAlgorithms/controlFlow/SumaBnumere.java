package algorithms.elementaryAlgorithms.controlFlow;
//1740
import java.util.Scanner;

public class SumaBnumere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a - (b * (b - 1) / 2)) % b == 0){
            System.out.println("DA");
        } else {
            System.out.println("NU");
        }
    }
}
