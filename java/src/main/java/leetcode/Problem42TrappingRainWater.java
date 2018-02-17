package leetcode;

/**
 * https://leetcode.com/problems/trapping-rain-water
 */
public final class Problem42TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int trap = 0;
        int maxLeft = 0;
        int maxRight = 0;

        while (left <= right) {
            maxLeft = Math.max(maxLeft, height[left]);
            maxRight = Math.max(maxRight, height[right]);

            if (maxLeft < maxRight) {
                trap += maxLeft - height[left];
                left++;
            } else {
                trap += maxRight - height[right];
                right--;
            }
        }

        return trap;
    }
}
