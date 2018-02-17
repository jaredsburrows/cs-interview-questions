package leetcode;

/**
 * https://leetcode.com/problems/flood-fill
 */
public final class Problem733FloodFill {
    // Time - O(N*M), Space - O(1)
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null                       // base
            || image[sr][sc] == newColor) {     // check start position color
            return image;
        }

        fill(image, sr, sc, image[sr][sc], newColor);

        return image;
    }

    // dfs
    private void fill(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if (image == null                       // base
            || sr < 0 || sr >= image.length     // x
            || sc < 0 || sc >= image[0].length  // y
            || image[sr][sc] != oldColor) {     // check previous color
            return;
        }

        image[sr][sc] = newColor;

        fill(image, sr + 1, sc, oldColor, newColor); // x right
        fill(image, sr - 1, sc, oldColor, newColor); // x left
        fill(image, sr, sc + 1, oldColor, newColor); // y down
        fill(image, sr, sc - 1, oldColor, newColor); // y up
    }
}
