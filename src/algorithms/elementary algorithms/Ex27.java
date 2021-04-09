package meditatii.pbInfo;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[]args){
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();

        System.out.print(1);
        for(int i = 1; i <= n; i++) {
            System.out.print(0);
        }
    }
}

