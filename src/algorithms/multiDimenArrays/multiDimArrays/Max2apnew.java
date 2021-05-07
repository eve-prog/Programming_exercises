package algorithms.multiDimenArrays.multiDimArrays;

import java.util.Scanner;
//789
public class Max2apnew {
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
        for(int i = n*m; i >= 1; i--){
            if(v[i-1]>=v[i]){
                v[i] = max;
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

