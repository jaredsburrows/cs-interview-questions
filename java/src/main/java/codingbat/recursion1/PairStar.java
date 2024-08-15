package codingbat.recursion1;

/**
 * https://codingbat.com/prob/p158175
 */
public final class PairStar {
    public String pairStar(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        if (str.length() >= 2 && str.substring(0, 1).equals(str.substring(1, 2))) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        } else {
            return str.charAt(0) + pairStar(str.substring(1));
        }
    }
}
