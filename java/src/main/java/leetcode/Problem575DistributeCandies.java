package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/distribute-candies/submissions/
 */
public final class Problem575DistributeCandies {
    public int distributeCandies(int[] candies) {
        if (candies == null || candies.length == 0) {
            return 0;
        }

        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies) {
            kinds.add(candy);
        }

        return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
    }
}
