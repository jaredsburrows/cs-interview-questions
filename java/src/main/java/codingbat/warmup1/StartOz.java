package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p199720
 */
public final class StartOz {
    public String startOz(String str) {
        if (str == null) {
            return "";
        }

        if (str.startsWith("oz")) {
            return "oz";
        } else if (!str.isEmpty() && str.charAt(0) == 'o') {
            return "o";
        } else if (!str.isEmpty() && str.charAt(1) == 'z') {
            return "z";
        } else {
            return "";
        }
    }
}
