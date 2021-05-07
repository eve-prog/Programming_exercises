package algorithms.multiDimenArrays.multiDimArrays;
// Să se determine elementul cu număr maxim de apariții în matrice.
// Dacă există mai multe elemente cu număr maxim de apariții se va afișa cel mai mare dintre ele.
import java.util.Scanner;
//773
public class MaxAp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v[] = new int [1000001];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = -1;
        int f = 0;
        for(int i = 0 ; i<=1000000; i++){
            v[i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                f = sc.nextInt();
                v[f]++;
            }
        }
//Determinăm frecvența maximă – maximul din f[] și
// cel mai mare element din v[] cu acea frecvență și îl afișam.
        for(int i = 1000000; i >= 0; i--){
            if(v[i] >= v[f]){
                max = i;
                break;
            }
        }
        if (max != -1) {
            System.out.println(max);
        }
    }
}