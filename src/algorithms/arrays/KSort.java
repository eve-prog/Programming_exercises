package meditatii.vectori;
//511
import java.util.Scanner;

public class KSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[1001];
        int k = sc.nextInt();
        int ok;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }

        do {
            ok = 1;
            for (int p = 1; p <= k - 1; p++) {
                if (v[p] > v[p + 1]){
                    ok = 0;

                    int aux = v[p];
                    v[p] = v[p + 1];
                    v[p + 1] = aux;
                }
            }
        } while (ok == 0);

        do{
            ok = 1;
            for (int j = k+1; j <= n-1; j++){
                if (v[j] < v[j+1]){
                    ok = 0;

                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }while (ok == 0);

        for (int i = 1; i <= n; i++){
            System.out.print(v[i] + " ");
        }

    }
}
