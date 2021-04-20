package algorithms.arrays;
//1191
import java.util.Scanner;

public class Arhitectura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] v = new int[1001];
        int ok;

        for (int i = 1; i <= n; i++){
            v[i] = sc.nextInt();
        }

        do{
            ok = 1;
            for (int p = 1; p <= n-1; p++){
                if (v[p] < v[p+1]){
                    ok = 0;

                    int aux = v[p];
                    v[p] = v[p+1];
                    v[p+1] = aux;
                }
            }
        }while(ok == 0);

        for (int i = 1; i <= n; i++){
            System.out.print(v[i] + " ");
        }
    }
}
