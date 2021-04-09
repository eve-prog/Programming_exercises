package meditatii.fibonacci;

import java.util.Scanner;

//255
public class SirFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 1;
        int b = 1;
        int c;

        if (n == 1) {
            System.out.print("1" + " ");
        } else {
            System.out.print("1 1" + " ");

            for (int i = 3; i <= n; ++i) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}
