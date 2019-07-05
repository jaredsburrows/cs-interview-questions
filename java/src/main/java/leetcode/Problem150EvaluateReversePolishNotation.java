package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/evaluate-reverse-polish-notation
 * https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1394/
 */
public final class Problem150EvaluateReversePolishNotation {
    // Time - O(N), Space - O(N)
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return -1;
        }

        int first;
        int second;
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    first = stack.pop();
                    second = stack.pop();

                    stack.push(second - first);
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    first = stack.pop();
                    second = stack.pop();

                    stack.push(second / first);
                    break;

                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }

        return stack.pop();
    }
}
