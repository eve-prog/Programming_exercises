package meditatii.pbInfo;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b = myObj.nextInt();

        int n = a;
        int m = b;

        while (n!=m){
            if (n<m){
                n = n + a;
            }else{
                m = m + b;
            }
        }
        System.out.println(n);
    }
}
