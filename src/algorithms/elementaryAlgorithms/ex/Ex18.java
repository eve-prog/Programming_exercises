package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        long p = myObj.nextLong();
        int nr = 1;
        while(nr <= p){
            System.out.print(nr + " ");
            nr = nr * n;
        }
    }
}
