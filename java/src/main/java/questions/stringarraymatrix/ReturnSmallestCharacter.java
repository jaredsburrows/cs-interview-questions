package questions.stringarraymatrix;

/**
 * Return the smallest character that is strictly larger than the search character, otherwise return
 * the first character in the string. <p> Given: - sorted list of letters, sorted in ascending
 * order. - character for which we are searching. Given the following inputs we expect the
 * corresponding output: ['c', 'f', 'j', 'p', 'v'], 'a' => 'c' ['c', 'f', 'j', 'p', 'v'], 'c' => 'f'
 * ['c', 'f', 'j', 'p', 'v'], 'k' => 'p' ['c', 'f', 'j', 'p', 'v'], 'z' => 'c' // The wrap around
 * case - ['c', 'f', 'k'], 'f' => 'k' ['c', 'f', 'k'], 'c' => 'f' ['c', 'f', 'k'], 'd' => 'f'
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class ReturnSmallestCharacter {
    // Time - O(N), Space - O(1)
    public static char findInsPoint2(String input, char target) {
        for (int i = 0; i < input.length(); i++) {

            final char current = input.charAt(i);
            if (target < current) {
                return current;
            }
        }

        return input.charAt(0);
    }

    // Time - O(LG N), Space - O(1)
    public static char findInsPoint(String input, char target) {

        int length = input.length() - 1;
        int low = 0;
        int high = length;
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(length);

        // 1. last car to wrap around to the beginning
        // 2. if the first character is smaller then the first
        // 3. if the last character is the target character
        if (target == 'z' || target < firstChar || lastChar == target) {
            return firstChar;
        }

        // binary search
        while (low < high) {
            final int middle = (low + high) / 2;
            final int left = Math.abs(input.charAt(middle) - target);
            final int right = Math.abs(input.charAt(middle + 1) - target);

            if (right <= left) {
                low = middle + 1;
            } else {
                high = middle;
            }
        }

        return input.charAt(high + 1);
    }
}
