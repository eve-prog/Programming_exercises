package meditatii.pbInfo;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int S = 0;
        for(int i=1;i<=n;i++) {
            int nr = i * i;
            S = S + nr * nr;
        }
        System.out.println("Rezultatul este " + S);
    }
}
