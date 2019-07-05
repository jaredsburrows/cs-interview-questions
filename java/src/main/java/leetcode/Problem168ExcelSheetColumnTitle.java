package leetcode;

/**
 * https://leetcode.com/problems/excel-sheet-column-title/submissions/
 */
public final class Problem168ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            n--;
            char character = (char) ('A' + (n % 26));
            stringBuilder.insert(0, character);
            n /= 26;
        }

        return stringBuilder.toString();
    }
}
