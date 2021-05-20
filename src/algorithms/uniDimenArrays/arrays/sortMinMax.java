package algorithms.uniDimenArrays.arrays;
//180
import java.util.Scanner;

public class sortMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];
        int min = 1000000000;
        int max = -1;
        int imax = 0;
        int imin = 0;
        int ok;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            if (v[i] > max) {
                max = v[i];
                imax = i;
            }
        }
        for (int j = 1; j <= n; j++) {
            if (v[j] < min) {
                min = v[j];
                imin = j;
            }
        }
        do{
            ok = 1;
            for (int p = imax; p <= imin - 1; p++){
                if (v[p] > v[p+1]){
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
