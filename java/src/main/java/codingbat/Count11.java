package codingbat;

/**
 * http://codingbat.com/prob/p167015
 */
public final class Count11 {
    public int count11(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        if (str.length() >= 2 && "11".equals(str.substring(0, 2))) {
            return count11(str.substring(2, str.length())) + 1;
        } else {
            return count11(str.substring(1, str.length()));
        }
    }
}
