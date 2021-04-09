package meditatii.vectori;
//553
import java.util.Scanner;
public class PozMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1000];
        int i, imin = 0, imax = 0;
        int minn = 1000000;
        int maxx = -1;

        for (i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
            if (v[i] < minn) {
                minn = v[i];
                imin = i;
            }
            if (v[i] > maxx) {
                maxx = v[i];
                imax = i;
            }
        }
        System.out.println(imin + " " + imax);
    }
}
