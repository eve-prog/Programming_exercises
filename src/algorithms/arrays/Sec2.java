package algorithms.arrays;

public class Sec2 {
    public static void main(String[] args) {
        int x[] = {5,3,2,5,1,3,2};

        for (int i = 0; i < x.length; i++){
            for (int j = i+1; j < x.length-1; j++){
                if (x[i] == x[j]){
                    System.out.println(x[i]);
                    break;
                }
            }
            break;
        }
    }
}
