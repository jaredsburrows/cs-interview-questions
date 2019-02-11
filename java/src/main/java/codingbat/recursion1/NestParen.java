package codingbat.recursion1;

/**
 * http://codingbat.com/prob/p183174
 */
public final class NestParen {
    public boolean nestParen(String str) {
        if (str == null) {
            return false;
        }

        if (str.isEmpty()) {
            return true;
        }

        if (str.length() >= 2
            && "(".equals(str.substring(0, 1))
            && ")".equals(str.substring(str.length() - 1))) {
            return nestParen(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }
}
