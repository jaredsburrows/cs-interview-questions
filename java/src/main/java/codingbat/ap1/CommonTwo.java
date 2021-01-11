package codingbat.ap1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://codingbat.com/prob/p100369
 */
public final class CommonTwo {
    public int commonTwo(String[] a, String[] b) {
        Set<String> a1 = new HashSet<>(Arrays.asList(a));
        Set<String> b1 = new HashSet<>(Arrays.asList(b));

        int count = 0;
        for (String s : a1) {
            for (String value : b1) {
                if (s.equals(value)) {
                    count++;
                }
            }
        }

        return count;
    }
}
