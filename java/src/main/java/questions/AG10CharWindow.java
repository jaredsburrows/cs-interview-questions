package questions;

import java.util.HashMap;
import java.util.Map;

public final class AG10CharWindow {
    // alphabet - a b c d
    public String getFrequent(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        final Map<Integer, Integer> map = new HashMap<>();

        int max = 0;
        int number = 0;

        for (int i = 10; i < input.length(); i++) {
            final int pos = i - 10;
            final int key = Character.getNumericValue(input.charAt(pos)) + (pos * 10);

            //Double.valueOf("").intValue()

            String.valueOf("ab").hashCode();
        }

        return null;
        //return String.valueOf()
        //int b = s.charAt(0); // 65
        //char c = (char) b  // 'A'


        // "abcdabcdab" -
    }

    Character fromNumericValue(int x) {
        if ((x < 0) || (x > 35)) {
            throw new IllegalArgumentException();
        }
        return Character.toUpperCase(Character.forDigit(x, 36));
    }

    private int encode(String input, int pos) {
        // Character.getNumericValue()
        return input.charAt(pos - 10) - 'a' + 1000000000
            + input.charAt(pos - 9) - 'a' + 100000000
            + input.charAt(pos - 8) - 'a' + 10000000
            + input.charAt(pos - 7) - 'a' + 1000000
            + input.charAt(pos - 6) - 'a' + 100000
            + input.charAt(pos - 5) - 'a' + 10000
            + input.charAt(pos - 4) - 'a' + 1000
            + input.charAt(pos - 3) - 'a' + 100
            + input.charAt(pos - 2) - 'a' + 10
            + input.charAt(pos - 1) - 'a' + 1
            + input.charAt(pos) - 'a';
    }

    private String decode(int input) {
        final StringBuilder sb = new StringBuilder();

        //input / 1000000000

        return sb.toString();
    }
}
