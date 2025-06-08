package pl.pp;

public class ArrayUtils {
    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int negativeCount = 0;
        int positiveSum = 0;
        for (int num : input) {
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveSum += num;
            }
        }
        return new int[] {negativeCount, positiveSum};
    }
}