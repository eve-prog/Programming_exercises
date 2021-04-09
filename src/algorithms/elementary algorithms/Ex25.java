package meditatii.pbInfo;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int S = 0;

        for (int d = 1; d * d <= n; d++){
            if (n % d == 0){
                S = S + d + n/d;
            }
            if (d * d == n){
                S = S - n/d;
            }
        }
        if (n * 2 == S) {
            System.out.println(n + " este perfect");
        }else{
            System.out.println(n + " nu este perfect");
        }
    }
}
