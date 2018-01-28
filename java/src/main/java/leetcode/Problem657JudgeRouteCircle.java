package leetcode;

/**
 * https://leetcode.com/problems/judge-route-circle
 */
public final class Problem657JudgeRouteCircle {
    // Time - O(N), Space - O(N)
    public static boolean judgeCircle(String moves) {
        if (moves == null) {
            return false;
        }

        final char[] array = moves.toCharArray();
        int x = 0;
        int y = 0;

        for (char anArray : array) {
            switch (anArray) {
                default:
                case 'R':
                    x++;
                    break;

                case 'L':
                    x--;
                    break;

                case 'U':
                    y++;
                    break;

                case 'D':
                    y--;
                    break;
            }
        }

        return x == 0 && y == 0;
    }
}
