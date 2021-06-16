package algorithms.uniDimenArrays.sequenceArrays;
//2921
import java.util.Scanner;

public class SumeSecv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[100002];
        long s[] = new long[100002];
        s[0] = 0;
        int p,i, j, k,r;
        long smax = 0;

        for (p = 1; p <= n; p++) {
            v[p] = sc.nextInt();
        }

        for(r = 1 ; r <= n ; r++) { //s[1] = v[1]; s[2]= v[1] + v[2]; s[3] = v[1]+v[2]+v[3]...
            s[r] = s[r - 1] + v[r];
        }

        int m = sc.nextInt();

        for (k = 1; k <= m; k++) {
            i = sc.nextInt();
            j = sc.nextInt();
            if (i > j) {
                int tmp = i;
                i = j;
                j = tmp;
            }
            if((s[j] - s[i-1]) > smax){
                smax = s[j] - s[i-1];
            }
        }
        System.out.println(smax);
    }
}