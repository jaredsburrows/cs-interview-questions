package codingbat.functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://codingbat.com/prob/p103456
 */
public final class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
            .filter(n -> n > 0 || n == 0)
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
