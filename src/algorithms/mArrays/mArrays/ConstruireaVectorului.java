package algorithms.mArrays.mArrays;

import java.util.Scanner;

//Fiind dat un vector v cu n elemente sa se construiasca alti 2 vectori :
//primul va contine numai elementele pare ,iar al doilea numai elementele impare ale vectorului initial
public class ConstruireaVectorului {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[200];
        int b[] = new int[100];
        int i;

        for (i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        int k = 0; //numeri in k elementele pare;
        for (i = 1; i <= n; i++) {
            if (a[i] % 2 == 0) {
                k++;
                b[k] = a[i];
            }
        }
        for (i = 1; i <= k; i++) {
            System.out.print(b[i] + " "); //afisezi vectorul b care are numai elementele pare din vectorul a.
        }
    }
}
