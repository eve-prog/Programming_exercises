package algorithms.elementaryAlgorithms.controlFlow;

import java.util.Scanner;

//382
public class AproapeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x,y;

        x = n / k * k;
        y = n / k * k + k;

        if(n - x <= y - n) {
            System.out.println(x);
        }else {
            System.out.println(y);
        }
    }
}

