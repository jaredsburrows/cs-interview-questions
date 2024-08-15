package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p199720
 */
public final class StartOz {
    public String startOz(String str) {
        if (str == null) {
            return "";
        }

        if (str.length() >= 2 && str.startsWith("oz")) {
            return "oz";
        } else if (str.length() >= 1 && str.charAt(0) == 'o') {
            return "o";
        } else if (str.length() >= 1 && str.charAt(1) == 'z') {
            return "z";
        } else {
            return "";
        }
    }
}
