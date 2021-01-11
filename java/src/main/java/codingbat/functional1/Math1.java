package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://codingbat.com/prob/p103869
 */
public final class Math1 {
    public List<Integer> math1(List<Integer> nums) {
        return nums.stream()
            .map(n -> (n + 1) * 10)
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
