package algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class S4 {
    public static void main(String[] args) {
     //   int[] array = {5,3,2,5,1,3,2};
        //int array[] = {1, 2, 2, 1, 5, 9};

        int array [] ={6, 10, 5, 4, 9, 120, 4, 6, 10};
        duplicate(array);
    }
    public static void duplicate(int[] array) {
        List<Integer> copiedArray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!copiedArray.contains(array[i])) {
                copiedArray.add(array[i]);
            } else {
                System.out.println(array[i]);
                return;
            }
        }
    }
}
