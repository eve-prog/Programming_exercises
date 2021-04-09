package meditatii.vectori;

public class S15 {

    public static void main(String[] args) {

        System.out.println(firstDuplicate(new int[]{5, 3, 2, 5, 1, 3, 2}));
    }
    private static int firstDuplicate(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int currentNr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentNr == numbers[j]) {
                    return currentNr;
                }
            }
        }
        throw new RuntimeException("No duplicate found");
    }
}


