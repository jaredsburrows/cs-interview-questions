package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 * https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1170/
 */
public final class Problem118PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> numbers = new ArrayList<>();
        if (numRows <= 0) {
            return numbers;
        }

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    row.add(1);
                } else {
                    row.add(numbers.get(i - 1).get(j - 1) + numbers.get(i - 1).get(j));
                }
            }

            numbers.add(row);
        }

        return numbers;
    }
}
