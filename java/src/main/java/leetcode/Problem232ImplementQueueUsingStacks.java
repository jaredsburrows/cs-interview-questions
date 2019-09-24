package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/implement-queue-using-stacks/
 */
@SuppressWarnings("ClassCanBeStatic") // Leetcode is not static
public final class Problem232ImplementQueueUsingStacks {
    public final class MyQueue {
        private final Deque<Integer> stack1 = new ArrayDeque<>();
        private final Deque<Integer> stack2 = new ArrayDeque<>();

        public void push(int x) {
            stack1.push(x);
        }

        public int pop() {
            // stack 2 needs to be empty to pop stack1
            if (!stack2.isEmpty()) {
                return stack2.pop();
            }

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            return stack2.pop();
        }

        public int peek() {
            // stack 2 needs to be empty to peek stack1
            if (!stack2.isEmpty()) {
                return stack2.peek();
            }

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            Integer value = stack2.peek();
            return value != null ? value : -1;
        }

        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
}
