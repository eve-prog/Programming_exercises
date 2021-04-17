package algorithms.elementaryAlgorithms.ex;
//3270
import java.util.Scanner;
public class Ex4 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        long n = myObj.nextLong();
        long S = 0;

        //acest algoritm are complexitatea O(n)
        //O(log(n)) - complexitatea pentru parcurgerea cifrelor lui n

//        for(long d = 1 ; d <= n ; d ++ )
//            if(n % d == 0){
//                if (d % 2 == 0)
//                    S = S + d;
//            }
//        System.out.println(S);

        for (long d = 1; d * d <= n; d++){
            if (n % d == 0){
                if (d % 2 == 0){
                    S = S + d;
                }
                if ((n/d) % 2 == 0){
                    S = S + n/d;
                }
            }
            if (d*d == n){
                if (d % 2 == 0){
                    S = S - d;
                }
            }
        }
        System.out.println(S);
    }
}
//aceasta metoda foloseste radical din n pasi, sqrt(n)
//complexitatea este O(sqrt(n))
