package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import leetcode.api.NestedInteger;

/**
 * https://leetcode.com/problems/nested-list-weight-sum
 */
public final class Problem339NestedListWeightSum {
    // queue
    public int depthSum(List<NestedInteger> nestedList) {
        if (nestedList == null || nestedList.isEmpty()) {
            return 0;
        }

        Deque<NestedInteger> queue = new ArrayDeque<>(nestedList);
        int sum = 0;
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                NestedInteger current = queue.poll();

                if (current != null) {
                    if (current.isInteger()) {
                        sum += current.getInteger() * level;
                    } else {
                        queue.addAll(current.getList()); // no offerAll in interface
                    }
                }
            }

            level++;
        }

        return sum;
    }

    // bfs
    public int depthSum2(List<NestedInteger> nestedList) {
        if (nestedList == null || nestedList.isEmpty()) {
            return 0;
        }

        int level = 1;
        int sum = 0;

        while (!nestedList.isEmpty()) {
            List<NestedInteger> temp = new ArrayList<>();
            for (NestedInteger nestedInteger : nestedList) {
                if (nestedInteger.isInteger()) {
                    sum += nestedInteger.getInteger() * level;
                } else {
                    temp.addAll(nestedInteger.getList());
                }
            }

            level++;
            nestedList.clear();
            nestedList.addAll(temp);
        }

        return sum;
    }
}
