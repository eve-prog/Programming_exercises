package meditatii.pbInfo;

import java.util.Scanner;

public class Puteri {


// Se da un număr n. Calculați ultima cifră a lui 2n.
//Fișierul de ieșire 2lan.out va conține ultima cifra a lui 2n

        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            int n = myObj.nextInt();

            int s = (int) Math.pow(2, n);
            System.out.println(s);

            if (n==0) {
                System.out.println(1);
            }else if(n%4==0) {
                System.out.println(6);
            }else if (n%4==1) {
                System.out.println(2);
            }else if (n%4==2) {
                System.out.println(4);
            }else if(n%4==3){
                System.out.println(8);
            }

        }
    }




