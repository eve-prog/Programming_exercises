package algorithms.elementaryAlgorithms.ex;

import java.util.Scanner;

public class Exercitii {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int x = myObj.nextInt();
        int y = myObj.nextInt();
        int val = myObj.nextInt();

        int i, j, c, V;
        V = (x-1)*n+y;
        c = val/n;

        if (val%n==0){
            i = c;
            j = n;
        }else{
            i = c+1;
            j = val%n;
        }
        System.out.println("" + V + " " + i + " " + j);

    }
}