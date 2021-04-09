package meditatii.vectori;
//2734
import java.util.Scanner;

public class ElimRep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vector[] = new int[1001];
        int i;
        for (i = 1; i <= n; i++) {
            vector[i] = sc.nextInt();
        }
        for (int p = 1; p <= n-1; p++){
            for(i = n; i >= p+1; i--){
                if(vector[p] == vector [i]){
                    for(int j = i; j <= n-1; j++){
                        vector[j] = vector[j+1];
                    }
                    n--;
                }
            }
        }
        for (i = 1; i <= n; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
// v = [1,2,3]