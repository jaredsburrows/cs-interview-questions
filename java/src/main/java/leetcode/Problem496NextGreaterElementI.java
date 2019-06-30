package leetcode;

/**
 * https://leetcode.com/problems/next-greater-element-i/
 */
public final class Problem496NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if ((nums1 == null || nums1.length == 0) || (nums2 == null || nums2.length == 0)) {
            return new int[0];
        }

        for (int i = 0; i < nums1.length; i++) {
            int nextNumber = -1;
            boolean found = false;
            int j = 0;

            while (nums2[j] != nums1[i]) {
                j++;
            }

            while (j < nums2.length) {
                if (nums2[j] > nums1[i]) {
                    nextNumber = nums2[j];
                    found = true;
                    break;
                }

                j++;
            }

            if (found) {
                nums1[i] = nextNumber;
            } else {
                nums1[i] = -1;
            }
        }

        return nums1;
    }
}
