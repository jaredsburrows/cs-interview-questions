package codingbat.ap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://codingbat.com/prob/p139150
 */
public final class MergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, a);
        Collections.addAll(list, b);

        Set<String> hs = new HashSet<>(list);
        list.clear();
        list.addAll(hs);

        Collections.sort(list);

        String[] f = new String[n];
        for (int i = 0; i < n; i++) {
            f[i] = list.get(i);
        }

        return f;
    }
}
