package codingbat;

public final class AllStar {
    public String allStar(String str) {
        if (str == null || str.isEmpty() || str.length() == 1) {
            return str;
        }

        final int nextLength = str.length() - 1;
        final String nextString = str.substring(0, nextLength);
        final String addStar = "*" + str.charAt(nextLength);

        return allStar(nextString) + addStar;
    }
}
