package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-sorted-array
 */
public final class Problem88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null) {
            return;
        }

        int left = m - 1;
        int right = n - 1;
        int length = n + m - 1;

        while (left >= 0 && right >= 0) {
            // Merge backwards
            if (nums1[left] > nums2[right]) {
                nums1[length--] = nums1[left--];
            } else {
                nums1[length--] = nums2[right--];
            }
        }

        // Fill the rest of array
        while (right >= 0) {
            nums1[length--] = nums2[right--];
        }
    }

    // Time - O(N+M), Space - O(N+M)
    public int[] merge(int[] left, int[] right) {
        if (left == null && right == null) {
            return new int[0];
        }

        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        final int[] merge = new int[left.length + right.length];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < merge.length; i++) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] < right[rightIndex]) {
                    merge[i] = left[leftIndex++];
                } else {
                    merge[i] = right[rightIndex++];
                }
            } else if (leftIndex < left.length) {
                merge[i] = left[leftIndex++];
            } else {
                merge[i] = right[rightIndex++];
            }
        }

        return merge;
    }

    // Time - O(N*M), Space - O(N)
    public List<Integer> merge(List<List<Integer>> numbers) {
        if (numbers == null) {
            return new ArrayList<>();
        }

        final List<Integer> sortedList = new ArrayList<>();

        for (List<Integer> number : numbers) {
            final List<Integer> mergedList = merge(number, sortedList);

            sortedList.clear();

            sortedList.addAll(mergedList);
        }

        return sortedList;
    }

    // Time - O(N), Space - O(N)
    public List<Integer> merge(List<Integer> left, List<Integer> right) {
        if (left == null && right == null) {
            return new ArrayList<>();
        }

        if (left == null) {
            left = new ArrayList<>();
        }

        if (right == null) {
            right = new ArrayList<>();
        }

        final List<Integer> sortedList = new ArrayList<>();

        int lengthLeft = left.size();
        int lengthRight = right.size();
        int indexLeft = 0;
        int indexRight = 0;

        while (indexLeft < lengthLeft && indexRight < lengthRight) {
            if (left.get(indexLeft) < right.get(indexRight)) {
                sortedList.add(left.get(indexLeft));
                indexLeft++;
            } else {
                sortedList.add(right.get(indexRight));
                indexRight++;
            }
        }

        while (indexLeft < lengthLeft) {
            sortedList.add(left.get(indexLeft));
            indexLeft++;
        }

        while (indexRight < lengthRight) {
            sortedList.add(right.get(indexRight));
            indexRight++;
        }

        return sortedList;
    }
}
