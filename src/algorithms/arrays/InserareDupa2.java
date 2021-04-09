package meditatii.vectori;
//sa se insereze după fiecare element par, jumătatea sa.
import java.util.Scanner;

public class InserareDupa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[54];

        for (int i = 1; i <= n; i++){
            v[i] = sc.nextInt();
        }
        for (int p = n; p >= 1; p--){
            if (v[p] % 2 == 0){
                for (int i = n; i >= p+1; i--){
                    v[i+1] = v[i];
                }
                v[p+1] = v[p]/2;
                n++;
            }
        }
        for (int i = 1; i <= n; i++){
            System.out.print(v[i] + " ");
        }
    }
}
