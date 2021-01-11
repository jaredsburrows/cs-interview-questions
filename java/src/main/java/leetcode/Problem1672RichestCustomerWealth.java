package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/richest-customer-wealth/
 */
public final class Problem1672RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        if (accounts == null || accounts.length == 0 || accounts[0].length == 0) {
            return -1;
        }

        int cols = accounts[0].length;
        int max = -1;

        for (int[] account : accounts) {
            int count = 0;
            for (int j = 0; j < cols; j++) {
                count += account[j];
            }
            max = Math.max(count, max);
        }

        return max;
    }

    // java 8+
    public int maximumWealth2(int[][] accounts) {
        if (accounts == null || accounts.length == 0 || accounts[0].length == 0) {
            return -1;
        }

        int max = -1;

        for (int[] account : accounts) {
            max = Math.max(Arrays.stream(account).sum(), max);
        }

        return max;
    }
}
