package leetcode;

/**
 * https://leetcode.com/problems/xor-operation-in-an-array/
 */
public final class Problem1486XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        if (n < 1 || start < 0) {
            return -1;
        }

        int toReturn = 0;
        for (int i = 0; i < n; i++) {
            toReturn ^= (start + 2 * i);
        }

        return toReturn;
    }
}
