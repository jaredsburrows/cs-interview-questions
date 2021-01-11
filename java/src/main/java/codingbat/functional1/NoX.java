package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://codingbat.com/prob/p105967
 */
public final class NoX {
    public List<String> noX(List<String> strings) {
        return strings.stream()
            .map(n -> n.replaceAll("x", ""))
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
