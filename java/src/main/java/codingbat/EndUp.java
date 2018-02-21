package codingbat;

/**
 * http://codingbat.com/prob/p125268
 */
public final class EndUp {
    public String endUp(String str) {
        if (str == null) {
            return "";
        }

        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            final char[] array = str.toCharArray();
            array[str.length() - 3] = str.toUpperCase().toCharArray()[str.length() - 3];
            array[str.length() - 2] = str.toUpperCase().toCharArray()[str.length() - 2];
            array[str.length() - 1] = str.toUpperCase().toCharArray()[str.length() - 1];
            return String.valueOf(array);
        }
    }
}
