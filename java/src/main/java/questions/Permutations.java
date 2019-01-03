package questions;

import java.util.ArrayList;
import java.util.List;

public final class Permutations {
    public static List<String> getStringPermutations(String prefix, String string) {
        if (string == null) {
            return new ArrayList<>();
        }

        List<String> permutations = new ArrayList<>();
        int length = string.length();
        if (length == 0) {
            // empty string
            permutations.add(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                // add to list
                permutations.addAll(
                    getStringPermutations(prefix + string.charAt(i),
                        string.substring(i + 1, length) + string.substring(0, i)));
            }
        }

        return permutations;
    }
}
