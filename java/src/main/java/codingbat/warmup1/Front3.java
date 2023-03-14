package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p136351
 */
public final class Front3 {
    public String front3(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str == null || str.isEmpty()) {
            return stringBuilder.toString();
        }

        if (str.length() < 3) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < str.length(); k++) {
                    stringBuilder.append(str.charAt(k));
                }
            }
            return stringBuilder.toString();
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                stringBuilder.append(str.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}
