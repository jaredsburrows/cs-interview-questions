package codingbat.recursion1;

/**
 * https://codingbat.com/prob/p170924
 */
public final class ChangePi {
    public String changePi(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        if (str.length() >= 2 && "pi".equals(str.substring(0, 2))) {
            return "3.14" + changePi(str.substring(2));
        } else {
            return str.charAt(0) + changePi(str.substring(1));
        }
    }
}
