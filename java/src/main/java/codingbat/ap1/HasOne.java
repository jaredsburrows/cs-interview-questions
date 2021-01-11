package codingbat.ap1;

/**
 * https://codingbat.com/prob/p191212
 */
public final class HasOne {
    public boolean hasOne(int n) {
        String number = String.valueOf(n);
        char[] temp = number.toCharArray();
        for (int i = 0; i < number.length(); i++) {
            if (temp[i] == '1') {
                return true;
            }
        }

        return false;
    }
}
