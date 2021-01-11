package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://codingbat.com/prob/p181634
 */
public final class Copies3 {
    public List<String> copies3(List<String> strings) {
        return strings.stream()
            .map(n -> n + n + n)
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
