package meditatii.vectori;

import java.util.Scanner;

public class AceeasiParitate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int v[] = new int[1002];

        for (int i = 1; i <= n; i++){
            v[i] = scanner.nextInt();
        }
        for (int p = n; p >= 2; p--){
            if (Math.abs(v[p]) % 2 == Math.abs(v[p-1]) % 2){
                for (int i = n; i >= p; i--){
                    v[i+1] = v[i];
                }
                v[p] = (v[p+1] + v[p-1]) / 2;
                n++;
            }
        }
        for (int i = 1; i <= n; i++){
            System.out.print(v[i] + " ");
        }
    }
}




