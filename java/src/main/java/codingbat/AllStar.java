package codingbat;

/**
 * http://codingbat.com/prob/p183394
 */
public final class AllStar {
    public String allStar(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        if (str.length() < 2) {
            return str.substring(0, 1);
        }

        return str.substring(0, 1) + "*" + allStar(str.substring(1, str.length()));
    }
}
