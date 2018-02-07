package leetcode;

import java.util.ArrayList;
import java.util.List;

// Max Chunks To Make Sorted?
public final class AGPartitionNoSort {
    // 0..n
    // 0-n only used once
    public List<List<Integer>> getPartionedArray(int[] array) {
        final List<List<Integer>> partitions = new ArrayList<>();
        if (array == null || array.length == 0) {
            return partitions;
        }

        int indexSum = 0;
        int numSum = 0;
        final List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            indexSum += i;
            numSum += array[i];
            temp.add(array[i]);

            if (indexSum == numSum) {
                partitions.add(new ArrayList<>(temp));
                temp.clear();
            }
        }

        return partitions;
    }
}
