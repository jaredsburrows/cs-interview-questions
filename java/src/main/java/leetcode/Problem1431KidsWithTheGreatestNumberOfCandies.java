package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
 */
public final class Problem1431KidsWithTheGreatestNumberOfCandies {
    // Performance - 1ms runtime - 100%
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            //noinspection ManualMinMaxCalculation
            max = max > candy ? max : candy;
        }

        List<Boolean> toReturn = new ArrayList<>(candies.length);
        for (int candy : candies) {
            toReturn.add((candy + extraCandies) >= max);
        }

        return toReturn;
    }

    // Performance - 1ms runtime - 87.18%
    public List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        List<Boolean> toReturn = new ArrayList<>(candies.length);
        for (int candy : candies) {
            toReturn.add((candy + extraCandies) >= max);
        }

        return toReturn;
    }
}
