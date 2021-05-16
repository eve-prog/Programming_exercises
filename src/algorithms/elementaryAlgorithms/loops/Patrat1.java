package algorithms.elementaryAlgorithms.loops;
//458

import java.util.Scanner;

public class Patrat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char c = scanner.next().charAt(0);
        char d = scanner.next().charAt(0);

        for (int i = 1; i <= n; i++){
            if(i%2 != 0){
                System.out.print(c);
                for (int j = 2; j <= n; j=j+2) {
                    System.out.print(d);
                    System.out.print(c);
                }
                System.out.println();
            }else{
                System.out.print(d);
                for (int j = 2; j <= n; j=j+2) {
                    System.out.print(c);
                    System.out.print(d);
                }
                System.out.println();
            }
        }
    }
}
