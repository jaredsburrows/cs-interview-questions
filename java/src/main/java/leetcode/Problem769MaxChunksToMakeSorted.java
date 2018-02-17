package leetcode;

/**
 * https://leetcode.com/problems/max-chunks-to-make-sorted
 */
public final class Problem769MaxChunksToMakeSorted {
    public int maxChunksToSorted(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int count = 0;
        int valueSum = 0;
        int indexSum = 0;

        for (int i = 0; i < arr.length; i++) {
            valueSum += arr[i];
            indexSum += i;

            if (valueSum == indexSum) {
                count++;
            }
        }

        return count;
    }
}
