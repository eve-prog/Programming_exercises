package algorithms.arrays;
//2689
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v[] = new int[1002];

        for (int p = 1; p <= n; p++) {
            v[p] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++){
            for (int j = n; j >= 1; j--){
                if (v[i] == v[j]) {
                    System.out.print(v[j]);
                    break;
                }
            }
        }
    }
}

