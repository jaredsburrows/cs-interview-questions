package crackingthecode.part1datastructures;

import java.util.Stack;

public class Chapter3StacksAndQueues {

    /**
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
     * 3.2 - How would you design a stack which, in addition to push and pop, also has a function
     * min which returns the minimum element? Push, pop and min should all operate in O(1) time.
     */
    // book suggest not to store min in each stack, too much memory from duplicates
    static class MinStack extends Stack<Integer> {
        Stack<Integer> minStack = new Stack<>();

        public void push(final int value) {
            if (value <= getMinimum()) {
                minStack.push(value);
            }

            super.push(value);
        }

        public Integer pop() {
            int value = super.pop();
            if (value == getMinimum()) {
                minStack.pop();
            }

            return value;
        }

        public Integer getMinimum() {
            if (minStack.isEmpty()) {
                return Integer.MAX_VALUE;
            } else {
                return minStack.peek();
            }
        }
    }



    // []
    // []
    // []
}
