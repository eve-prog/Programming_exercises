package meditatii.vectori;
//490
import java.util.Scanner;
public class AfisareMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vmin = 2000000000;
        int vmax = -2000000000;
        int i,imin=0,imax=0;

        int v[] = new int[1002];

        for (i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
            if (v[i] < vmin) {
                imin = i;
                vmin = v[i];
            }
            if (v[i] > vmax) {
                imax = i;
                vmax = v[i];
            }
        }
        if (imin > imax) {
            int a = imin;
            imin = imax;
            imax = a;
        }
        for (i = imin; i <= imax; i++) {
            System.out.print(v[i] + " ");
        }
    }
}