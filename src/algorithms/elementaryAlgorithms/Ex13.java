package meditatii.pbInfo;

import java.util.Scanner;
//171
public class Ex13 {
    public static void main(String [] args){
        Scanner myObj = new Scanner(System.in);
        int numere = myObj.nextInt();
        long min = 1000000000;
        long max = -1000000000;

        for (int i = 1; i <= numere; i++){
            long n =  myObj.nextLong();
            long p = n;
            while (p > 9)
            {
                p = p / 10;
            }
            if (p < min){
                min = p;
                max = n;
            }else if(p == min){
                if (n>max){
                    max = n;
                }
            }
        }
        System.out.println(max);
    }
}
