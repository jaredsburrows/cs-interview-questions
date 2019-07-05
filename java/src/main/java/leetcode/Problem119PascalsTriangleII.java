package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 * https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1171/
 */
public final class Problem119PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> numbers = new ArrayList<>();

        for (int i = 0; i <= rowIndex + 1; i++) {
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

        return numbers.get(rowIndex);
    }
}
