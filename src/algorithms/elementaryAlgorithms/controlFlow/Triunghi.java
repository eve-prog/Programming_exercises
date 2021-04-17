package algorithms.elementaryAlgorithms.controlFlow;
//179
import java.util.Scanner;

public class Triunghi {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double a = Double.parseDouble(myObj.next());
        double b = Double.parseDouble(myObj.next());
        double c = Double.parseDouble(myObj.next());

        if ((a<b+c)&&(b<a+c)&&(c<a+b)){
            System.out.println("da");
        }else{
            System.out.println("nu");
        }
    }
}


