package questions.combinationspermutation;

import java.util.ArrayList;

public class Permutations {
    public static ArrayList<String> getStringPermutations(final String prefix, final String string) {
        final ArrayList<String> permutations = new ArrayList<>();
        if (string == null || string.isEmpty()) {
            permutations.add(prefix);
        } else {
            int length = string.length();
            for (int i = 0; i < length; i++) {
                permutations.addAll(getStringPermutations(prefix + string.charAt(i), string.substring(i + 1, length) + string.substring(0, i)));
            }
        }
        return permutations;
    }
}
