package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://codingbat.com/prob/p139586
 */
public final class Square {
    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
            .map(n -> n * n)
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
