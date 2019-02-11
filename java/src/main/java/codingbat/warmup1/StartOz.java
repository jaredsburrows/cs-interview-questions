package codingbat.warmup1;

/**
 * http://codingbat.com/prob/p199720
 */
public final class StartOz {
    public String startOz(String str) {
        if (str == null) {
            return "";
        }

        if (str.length() >= 2 && str.startsWith("oz")) {
            return "oz";
        } else if (str.length() >= 1 && str.substring(0, 1).equals("o")) {
            return "o";
        } else if (str.length() >= 1 && str.substring(1, 2).equals("z")) {
            return "z";
        } else {
            return "";
        }
    }
}
