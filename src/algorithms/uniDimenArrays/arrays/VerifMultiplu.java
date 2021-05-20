package algorithms.uniDimenArrays.arrays;
//292
import java.util.Scanner;

public class VerifMultiplu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[502];
        int multiplu = 0;

        for (int i = 1;i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (int p = 1; p <= n; p++){
            if (v[p] % v[n] == 0){
                multiplu++;
            }
        }
        if (multiplu == n){
            System.out.println("DA");
        }else{
            System.out.println("NU");
        }

    }
}