package codingbat;

/**
 * http://codingbat.com/prob/p161642
 */
public final class BackAround {
    public String backAround(String str) {
        char[] array = str.toCharArray();
        return array[str.length() - 1] + str + array[str.length() - 1];
    }
}
