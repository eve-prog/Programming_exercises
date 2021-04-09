package meditatii.pbInfo;


import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int numere = myObj.nextInt();
        int max = -1000000;
        int a = 0;

        for (int i = 1; i <= numere; i++){
            int n = myObj.nextInt();

            if (n>max) {
                max = n;
                a = 1;
            }else if(n == max){
                a++;
            }
        }
        System.out.println(max + " " + a);
    }
}