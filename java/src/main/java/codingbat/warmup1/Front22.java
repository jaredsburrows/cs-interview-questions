package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p183592
 */
public final class Front22 {
    public String front22(String str) {
        if (str == null) {
            return "";
        }

        if (str.length() < 2) {
            return str + str + str;
        } else {
            String front = str.substring(0, 2);
            return front + str + front;
        }
    }
}
