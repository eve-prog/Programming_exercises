package algorithms.arrays;
//505
import java.util.Scanner;

public class Identice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[1002];
        int x[] = new int[1002];
        int egale = 0;

        for (int i = 1; i <= n; i++){
            v[i] = sc.nextInt();
        }
        for (int j = 1; j <= n; j++){
            x[j] = sc.nextInt();
        }
        for (int p = 1; p <= n; p++){
            for (int r = 1; r <= n; r++){
                if (v[p] == x[r]) {
                    egale++;
                    if (v[p] == v[p+1]){
                        egale--;
                    }
                }
            }
        }
        if (egale == n){
            System.out.println("DA");
        }else{
            System.out.println("NU");
        }

    }
}
