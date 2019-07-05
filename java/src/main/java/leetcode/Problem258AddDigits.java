package leetcode;

/**
 * https://leetcode.com/problems/add-digits/
 */
public final class Problem258AddDigits {
    public int addDigits(int num) {
        return 1 + ((num - 1) % 9);
    }
}
