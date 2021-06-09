package algorithms.uniDimenArrays.sequenceArrays;
//518
import java.util.Scanner;

public class SecvZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];
        int lmax = 0;
        int st = 0;
        int dr = 0;

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (v[i] == 0) {
                int j = i;
                while (j + 1 < n && v[j + 1] == 0) {
                    j++;
                }
                if (j - i + 1 > lmax) {
                    lmax = j -i + 1;
                    st = i;
                    dr = j;
                }
                i = j;
            }
        }
        System.out.println((st+1) + " " + (dr+1));
    }
}