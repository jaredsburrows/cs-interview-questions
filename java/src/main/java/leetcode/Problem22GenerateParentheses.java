package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/description
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem22GenerateParentheses {
    // Space - O(N)
    public List<String> generateParenthesis(int n) {
        final List<String> parenthesis = new ArrayList<>();
        if (n < 0) {
            return parenthesis;
        }

        generateParenthesis(parenthesis, "", 0, 0, n);
        return parenthesis;
    }

    // backrack
    private void generateParenthesis(List<String> parenthesis, String input, int open, int close, int max) {
        if (input.length() == max * 2) {
            parenthesis.add(input);
            return;
        }

        if (open < max) {
            generateParenthesis(parenthesis, input + "(", open + 1, close, max);
        }

        if (close < open) {
            generateParenthesis(parenthesis, input + ")", open, close + 1, max);
        }
    }
}
