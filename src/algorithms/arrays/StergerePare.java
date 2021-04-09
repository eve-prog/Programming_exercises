package meditatii.vectori;
//sa se stearga elementele pare din vectorul citit
import java.util.Scanner;

public class StergerePare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vector = new int[1002];
        int i;

        for (i = 1; i <= n; i++) {
            vector[i] = sc.nextInt();
        }
        for (int p = n; p >= 1; p--){
            if (vector[p] % 2 == 0){
               for (i = p+1; i<=n; i++){
                   vector[i-1]=vector[i]; //v[i] se muta in stg lui
                   vector[i] = 0;
               }
               n--;
            }
        }
        for ( i = 1; i<=n; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
