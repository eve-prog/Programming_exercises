package meditatii.vectori;

import java.util.Scanner;

public class VerifEgale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[502];
        int egale = 0;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = n; i >= 1; i--) {
            if (v[i] == v[i-1]){
                egale++;
            }
        }
        if (egale == (n-1)){
            System.out.println("DA");
        }else{
            System.out.println("NU");
        }

    }
}
