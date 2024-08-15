package codingbat.recursion1;

/**
 * https://codingbat.com/prob/p183394
 */
public final class AllStar {
    public String allStar(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        if (str.length() < 2) {
            return str.substring(0, 1);
        }

        return str.charAt(0) + "*" + allStar(str.substring(1));
    }
}
