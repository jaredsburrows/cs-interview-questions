package codingbat.functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://codingbat.com/prob/p105671
 */
public final class NoZ {
    public List<String> noZ(List<String> strings) {
        return strings.stream()
            .filter(s -> !s.contains("z"))
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
