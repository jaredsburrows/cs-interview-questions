package leetcode;

/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 */
public final class Problem1108DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        if (address == null || address.isEmpty()) {
            return "";
        }

        char[] characters = address.toCharArray();
        StringBuilder builder = new StringBuilder(characters.length + 6); // [] x 3

        for (char c : characters) {
            if (c == '.') {
                builder.append("[.]");
            } else {
                builder.append(c);
            }
        }

        return builder.toString();
    }
}
