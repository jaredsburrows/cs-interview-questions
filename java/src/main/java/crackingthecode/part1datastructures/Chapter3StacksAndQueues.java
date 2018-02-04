package crackingthecode.part1datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@SuppressWarnings("JdkObsolete")
public final class Chapter3StacksAndQueues {
    /*
     * 3.1 - Describe how you could use a single array to implement three stacks.
     */
    // n - size of array
    // k - number of stacks
    // n/k - divide up the array into equal parts for stacks
    // push(int stackNumber, int value) - use "stackNumber" to identify stack, value to add to stack
    // pop(int stackNumber) - use "stackNumber" to identify stack, pop LIFO
    // int[] to keep all stacks together
    // use int[] or 3 ints to keep track of the top of each stack - length of stack
    //  0  1  2     3  4  5     6  7  8  9
    // [1][2][3] | [1][2][0] | [0][0][0][0] - stack 1 - 3, stack 2 - 2, stack 3 - 0

    /**
     * 3.6 - Write a program to sort a stack in ascending order. You should not make any assumptions
     * about how the stack is implemented. The following are the only functions that should be used to
     * write this program: push | pop | peek | isEmpty.
     */
    // Time - O(N^2), Space - O(N)
    public Stack<Integer> getSortedStack(Stack<Integer> stack) {
        final Stack<Integer> sortedStack = new Stack<>();

        while (!stack.isEmpty()) {
            final int popped = stack.pop();
            while (!sortedStack.isEmpty() && sortedStack.peek() > popped) {
                stack.push(sortedStack.pop());
            }
            sortedStack.push(popped);
        }

        return sortedStack;
    }

    /**
     * 3.2 - How would you design a stack which, in addition to push and pop, also has a function
     * getMinNode which returns the minimum element? Push, pop and getMinNode should all operate in
     * O(1) time.
     */
    // book suggest not to store getMinNode in each stack, too much memory from duplicates
    public static class MinStack extends Stack<Integer> {
        private static final long serialVersionUID = 587482623921067655L;
        private final Stack<Integer> stack = new Stack<>();

        @Override
        public Integer push(Integer value) {
            if (value <= getMinimum()) {
                stack.push(value);
            }

            return super.push(value);
        }

        @Override
        public synchronized Integer pop() {
            final int value = super.pop();
            if (value == getMinimum()) {
                stack.pop();
            }

            return value;
        }

        public Integer getMinimum() {
            return stack.isEmpty() ? Integer.MAX_VALUE : stack.peek();
        }
    }

    /*
     * 3.4 - In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different
     * sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending order
     * of size from top to bottom (e.g., each disk sits on top of an even larger one). You have the
     * following constraints:
     * (A) Only one disk can be moved at a time.
     * (B) A disk is slid off the top of one rod onto the next rod.
     * (C) A disk can only be placed on top of a larger disk.
     * Write a program to move the disks from the first rod to the last using Stacks
     */

    /**
     * 3.3 - Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
     * Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
     * threshold. Implement a data structure SetOfStacks that mimics  SetOfStacks should be composed
     * of several stacks, and should create a new stack once the previous one exceeds capacity.
     * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack (that is,
     * pop() should return the same values as it would if there were just a single stack). FOLLOW UP
     * Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.
     */
    // stack is too high, it might topple
    // create a new one when the previous exceeds capacity
    public static class SetOfStacks<T> {
        private final List<Stack<T>> stacks = new ArrayList<>();
        private int currentStack;
        private int capacity;

        public SetOfStacks(int capacity) {
            this.capacity = capacity;

            currentStack = 0;
            stacks.add(new Stack<>());
        }

        public void push(T item) {
            if (stacks.get(currentStack).size() == capacity) {
                final Stack<T> stack = new Stack<>();
                stack.push(item);
                stacks.add(stack);
                currentStack++;
            } else {
                stacks.get(currentStack).push(item);
            }
        }

        public T pop() {
            if (!stacks.get(currentStack).isEmpty()) {
                return stacks.get(currentStack).pop();
            } else if (currentStack > 0 && stacks.get(currentStack).isEmpty()) {
                stacks.remove(currentStack);
                currentStack--;
                return stacks.get(currentStack).pop();
            }

            return null;
        }

        public T popAt(int index) {
            return stacks.get(index).pop();
        }
    }

    /**
     * 3.5 - Implement a MyQueue class which implements a queue using two stacks.
     */
    // [3]     [1]
    // [2]  -> [2]
    // [1]     [3]
    public static class MyQueue<T> {
        private final Stack<T> stack1 = new Stack<>();
        private final Stack<T> stack2 = new Stack<>();

        // Time - O(1)
        public int size() {
            return stack1.size() + stack2.size();
        }

        // Time - O(1)
        public void push(T item) {
            stack1.push(item);
        }

        // Time - O(N)
        public T remove() {
            // stack 2 needs to be empty to pop stack1
            if (!stack2.isEmpty()) {
                return stack2.pop();
            }

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            return stack2.pop();
        }

        // Time - O(N)
        public T peek() {
            // stack 2 needs to be empty to peek stack1
            if (!stack2.isEmpty()) {
                return stack2.peek();
            }

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            return stack2.peek();
        }
    }
}
