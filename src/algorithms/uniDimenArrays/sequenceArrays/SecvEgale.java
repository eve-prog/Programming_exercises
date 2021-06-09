package algorithms.uniDimenArrays.sequenceArrays;
//523
import java.util.Scanner;

public class SecvEgale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[1001];
        int lmax = 0;
        int st = 0;
        int dr = 0;

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j + 1 <= n && v[j + 1] == v[j]) {
                j++;
            }
            if (j - i + 1 >= lmax) {
                lmax = j - i + 1;
                st = i;
                dr = j;
            }
            i = j;
        }
        System.out.println(st + " " + dr);
    }
}
