package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://codingbat.com/prob/p177528
 */
public final class MoreY {
    public List<String> moreY(List<String> strings) {
        return strings.stream()
            .map(n -> "y" + n + "y")
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
