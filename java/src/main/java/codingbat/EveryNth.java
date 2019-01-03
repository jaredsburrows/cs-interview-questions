package codingbat;

/**
 * http://codingbat.com/prob/p196441
 */
public final class EveryNth {
    public String everyNth(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str == null || str.isEmpty()) {
            return stringBuilder.toString();
        }

        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0) {
                stringBuilder.append(str.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}
