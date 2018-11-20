package leetcode;

/**
 * https://leetcode.com/problems/nim-game
 */
public final class Problem292NimGame {
    // Time - O(1), Space - O(1)
    public boolean canWinNim(int n) {
        return n >= 0 && n % 4 != 0;
    }
}
