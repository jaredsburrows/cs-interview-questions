package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p173784
 */
public final class StringE {
    public boolean stringE(String str) {
        if (str == null) {
            return false;
        }

        char[] array = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (array[i] == 'e') {
                count++;
            }
        }

        return count >= 1 && count <= 3;
    }
}
