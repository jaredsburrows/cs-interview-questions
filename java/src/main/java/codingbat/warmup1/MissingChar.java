package codingbat.warmup1;

/**
 * http://codingbat.com/prob/p190570
 */
public final class MissingChar {
    public String missingChar(String str, int n) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (n != i) {
                temp.append(str.charAt(i));
            }
        }

        return temp.toString();
    }
}
