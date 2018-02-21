package codingbat;

/**
 * http://codingbat.com/prob/p123384
 */
public final class FrontBack {
    public String frontBack(String str) {
        if (str == null) {
            return "";
        }

        if (str.length() > 1) {
            final char[] array = str.toCharArray();

            swap(array, 0, str.length() - 1);

            return String.valueOf(array);
        } else {
            return str;
        }
    }

    private void swap(char[] array, int left, int right) {
        final char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
