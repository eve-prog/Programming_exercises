package algorithms.uniDimenArrays.arrays;

import java.util.Scanner;

//sa se stearga elementele impare din vectorul citit, pornind de la 1
public class StergereDivizibil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] v = new int [1002];

        for(int i = 1; i <= n; i++){
            v[i] = sc.nextInt();
        }
        for (int p = n; p >= 1; p--){
            if (v[p] % 2 != 0){
                for (int i = p+1; i <= n; i++){
                    v[i-1] = v[i];
                }
                n--;
            }
        }
        for (int i = 1; i <= n; i++){
            System.out.println(v[i] + " ");
        }
    }
}
