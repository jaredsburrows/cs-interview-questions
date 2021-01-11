package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * https://codingbat.com/prob/p186894
 */
public final class Lower {
    public List<String> lower(List<String> strings) {
        return strings.stream()
            .map(n -> n.toLowerCase(Locale.getDefault()))
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
