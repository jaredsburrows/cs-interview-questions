package leetcode;

/**
 * https://leetcode.com/problems/judge-route-circle
 */
public final class Problem657JudgeRouteCircle {
    // Time - O(N), Space - O(N)
    public boolean judgeCircle(String moves) {
        if (moves == null) {
            return false;
        }

        char[] array = moves.toCharArray();
        int x = 0;
        int y = 0;

        for (char c : array) {
            switch (c) {
                case 'L':
                    x--;
                    break;

                case 'U':
                    y++;
                    break;

                case 'D':
                    y--;
                    break;

                case 'R':
                default:
                    x++;
                    break;
            }
        }

        return x == 0 && y == 0;
    }
}
