package leetcode;

/**
 * https://leetcode.com/problems/integer-to-english-words
 */
public final class Problem273IntegerToEnglishWords {
    private final String[] UNDER_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        final StringBuilder sb = new StringBuilder();
        int i = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                sb.insert(0, helper(num % 1000) + THOUSANDS[i] + " ");
            }

            num /= 1000;
            i++;
        }

        return sb.toString().trim();
    }

    private String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return UNDER_20[num] + " ";
        } else if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        } else {
            return UNDER_20[num / 100] + " Hundred " + helper(num % 100);
        }
    }
}
