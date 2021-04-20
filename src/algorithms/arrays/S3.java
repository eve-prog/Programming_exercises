package algorithms.arrays;

public class S3 {
    public static void main(String[] args) {
       // int v[] = {1, 2, 2, 1, 5, 9};
        //int v[] = {5,3,2,5,1,3,2};
        int v [] ={6, 10, 5, 4, 9, 120, 4, 6, 10};
        int ok=1;
        for (int i = 0; i < v.length - 1 && ok == 1; i++) {
            for (int j = i + 1; j < v.length && ok == 1; j++) {
                if (v[i] == v[j]) {
                    System.out.println(v[i]);
                    ok=0;
                }
            }
        }
        if(ok==1){
            System.out.println("nu exista dubluri");
        }
    }
}

