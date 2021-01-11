package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://codingbat.com/prob/p152194
 */
public final class RightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
            .map(n -> n % 10)
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
