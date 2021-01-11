package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://codingbat.com/prob/p117665
 */
public final class Doubling {
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).collect(Collectors.toCollection(ArrayList::new));
    }
}
