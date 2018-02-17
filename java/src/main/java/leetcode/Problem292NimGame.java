package leetcode;

/**
 * https://leetcode.com/problems/nim-game
 */
public final class Problem292NimGame {
    public boolean canWinNim(int n) {
        return n >= 0 && n % 4 != 0;
    }
}
