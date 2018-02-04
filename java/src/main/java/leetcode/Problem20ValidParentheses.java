package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/valid-parentheses/description
 */
public final class Problem20ValidParentheses {
    // Time - O(N), Space - O(N)
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        final Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;

                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;

                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;

                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;

                default:
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
