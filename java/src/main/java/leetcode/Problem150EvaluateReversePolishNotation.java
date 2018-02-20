package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/evaluate-reverse-polish-notation
 */
public final class Problem150EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return -1;
        }

        int first;
        int second;
        final Deque<Integer> stack = new ArrayDeque<>();

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
