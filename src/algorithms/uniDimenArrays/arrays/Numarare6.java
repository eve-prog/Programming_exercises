package algorithms.uniDimenArrays.arrays;
//547
import java.util.Scanner;
public class Numarare6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 1000000;
        int max = -1;
        int elemente = 0;

        int v[] = new int[1002];

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (v[i] > max) {
                max = v[i];
            }
            if (v[i] < min) {
                min = v[i];
            }
        }
        int x = max - min;
        for (int i = 1; i <= n; i++){
            if (v[i] == x){
                elemente++;
            }
        }
        System.out.println(elemente);
    }
}