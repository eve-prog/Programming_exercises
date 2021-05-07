package algorithms.multiDimenArrays.multiDimArrays;
//771
import java.util.Scanner;

public class OrdLin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int A[][] = new int[102][102];
        int v[] = new int [1000001];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = -1;

        for(int i = 1; i <= n*m; i++){
            v[i]= sc.nextInt();
        }

        for (int i = 1; i <= n-1; i++) {
            for (int j = i+1; j <= n; j++) {
                if(v[i] > v[i+1]){

                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                }
            }
        }
        for(int i = n*m; i >= 1; i--){
            if(v[i-1] >= v[i]){
                max = v[i];
                break;
            }
        }
        if (max != -1){
            System.out.println(max);
        }else{
            System.out.println("IMPOSIBIL");
        }
    }
}

