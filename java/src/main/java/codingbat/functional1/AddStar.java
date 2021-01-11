package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://codingbat.com/prob/p170181
 */
public final class AddStar {
    public List<String> addStar(List<String> strings) {
        return strings.stream()
            .map(n -> n + "*")
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
