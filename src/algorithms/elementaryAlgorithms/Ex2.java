package meditatii.pbInfo;

import java.util.Scanner;
//376
public class Ex2 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        long S = 0;

        for (int d = 1; d * d <= n; d++){
            if (n % d == 0){
                S = S + d + n/d;
            }
            if (d * d == n){
                S = S - d;
            }
        }
        System.out.println(S);
    }
}


