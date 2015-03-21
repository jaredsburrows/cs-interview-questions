package questions;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<String> getPermutationsRecursion(String prefix, String str) {
        List<String> permutations = new ArrayList<>();
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations.addAll(getPermutationsRecursion(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i)));
            }
        }
        return permutations;
    }
}
