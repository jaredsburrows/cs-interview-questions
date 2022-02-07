package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/distribute-candies/submissions/
 */
public final class Problem575DistributeCandies {
    public int distributeCandies(int[] candyType) {
        if (candyType == null || candyType.length == 0) {
            return 0;
        }

        Set<Integer> kinds = new HashSet<>();
        for (int candy : candyType) {
            kinds.add(candy);
        }

        return Math.min(kinds.size(), candyType.length / 2);
    }
}
