package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/fizz-buzz
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Problem412FizzBuzz {
    // Time - O(N), Space - O(N)
    public static List<String> fizzBuzz(int n) {
        final List<String> fizzBuzz = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzz.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(String.valueOf(i));
            }
        }

        return fizzBuzz;
    }
}
