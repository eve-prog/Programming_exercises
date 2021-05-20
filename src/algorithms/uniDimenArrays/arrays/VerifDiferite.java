package algorithms.uniDimenArrays.arrays;
//502
import java.util.Scanner;

public class VerifDiferite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[502];

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }

        int diferite = 1; //true
        for (int i = 1; i <= n-1; i++){
            for (int j = i+1; j <= n; j++){
                if (v[i] == v[j]){
                    diferite = 0; //false
                }
            }
        }
        if (diferite == 0){
            System.out.println("DA");
        }else{
            System.out.println("NU");
        }
    }
}