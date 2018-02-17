package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/integer-to-roman
 */
public final class Problem12IntegerToRoman {
    // Time - O(1), Space - O(1)
    public String intToRoman(int num) {
        if (num <= 0) {
            return "";
        }

        final String M[] = {"", "M", "MM", "MMM"};
        final String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        final String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        final String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num / 1000]            // eg 3999 -> 3.999
            + C[(num % 1000) / 100]     // eg 3999 -> 9.99
            + X[(num % 100) / 10]       // eg 3999 -> 9.9
            + I[num % 10];              // eg 3999 -> 9
    }

    // Time limit exceeded
    public String intToRoman2(int num) {
        if (num <= 0) {
            return "";
        }

        final Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        for (Integer integer : map.keySet()) {
            if (num >= integer) {
                return map.get(integer) + intToRoman2(num - integer);
            }
        }

        return "";
    }
}
