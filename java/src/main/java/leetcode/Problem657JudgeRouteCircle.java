package leetcode;

/**
 * https://leetcode.com/problems/judge-route-circle
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
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

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'R') {
                x++;
            }

            if (array[i] == 'L') {
                x--;
            }

            if (array[i] == 'U') {
                y++;
            }

            if (array[i] == 'D') {
                y--;
            }
        }

        return x == 0 && y == 0;
    }
}
