package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

//3620
public class Ex5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        long k = myObj.nextLong();

        while (n > 0 && n % 10 <= k) {
            n = n / 10;
        }
        if (n == 0){
            System.out.println("da");
        }else{
            System.out.println("nu");
        }
    }
}

