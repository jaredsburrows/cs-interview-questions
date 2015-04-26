package questions.combinationspermutation;

import java.util.ArrayList;

public class Permutations {

    public ArrayList<String> getStringPermutations(final String prefix, final String string) {
        if (string == null) {
            return null;
        }

        ArrayList<String> finalList = new ArrayList<>();
        int length = string.length();
        if (length == 0) {
            // empty string
            finalList.add(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                // add to final list
                finalList.addAll(getStringPermutations(prefix + string.charAt(i), string.substring(i + 1, length) + string.substring(0, i)));
            }
        }

        return finalList;
    }
}
