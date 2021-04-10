package algorithms.elementaryAlgorithms;

import java.util.Scanner;

//3664

public class Cifre {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int p = 0, i = 0;

        for (int j = 1; j <= n; j++){
            int nr = myObj.nextInt();
            do {
                int uc = nr % 10;
                if (uc % 2 == 0){
                    p++;
                }else{
                    i++;
                }
                nr = nr/10;
            }while(nr!=0);
        }
        System.out.println(p + " " + i);
    }
}

