package meditatii.vectori;
//506
import java.util.Scanner;
public class ExistaPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[202];
        int contor = 0;
        int prim;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            prim = 1; //true
            //verificam daca are mai multi divizori => nu este prim
            for (int d = 2; d*d <= v[i]; d++) {
                if (v[i] % d == 0) {
                    prim = 0; //false
                }
            }
            if (prim == 1 && v[i] >= 2) {
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
// a = 24, divizorii sunt 1, 2, 3, 4, 6, 8, 12, 24
// a = 24, 1*24, 2*12, 3*8, 4*6

// daca 1 este divizor al lui 24, atunci 24/1 = 24 => 24 este divizor al lui 24
// daca 2 este divizor al lui 24, atunci 24/2 = 12 => 12 este divizor al lui 24
// daca 3 este divizor al lui 24, atunci 24/3 = 8  =>  8 este divizor al lui 24
// daca 4 este divizor al lui 24, atunci 24/4 = 6  =>  6 este divizor al lui 24