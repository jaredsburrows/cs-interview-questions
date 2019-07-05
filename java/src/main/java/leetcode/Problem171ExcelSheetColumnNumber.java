package leetcode;

/**
 * https://leetcode.com/problems/excel-sheet-column-number/
 */
public final class Problem171ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n *= 26;
            n += ((int) s.charAt(i) - 'A') + 1;
        }
        return n;
    }
}
