package crackingthecode.part2conceptsandalgorithms;

import java.util.ArrayList;

public class Chapter8Recursion {

    /**
     * 8.1 - Write a method to generate the nth Fibonacci number.
     */
    public static long getFibNumberRecursive(final long n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        } else {
            return (getFibNumberRecursive(n - 1) + getFibNumberRecursive(n - 2));
        }
    }

    public static long getFibNumberIterative(final long n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }

        if (n <= 2) {
            return 1;
        }

        int first = 1;
        int second = 1;
        int third = 0;

        for (int i = 3; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;

        }

        return third;
    }

    /**
     * 8.2 - Imagine a robot sitting on the upper left hand corner of an NxN grid. The robot can
     * only move in two directions: right and down. How many possible paths are there for the robot?
     * FOLLOW UP
     * Imagine certain squares are “off limits”, such that the robot can not step on them. Design an
     * algorithm to get all possible paths for the robot.
     */
    // TODO
    // http://artofproblemsolving.com/community/c21002t54378f21002h1058853_lattice_paths
    // - n!/(r! * (n - r)!), N = 20, (40 20) - 40!/(20! * (40 - 20)!) - (20 * 2!/20!)/20! - > (21 -> 40)/20!
    // 2N! / (N! * (2N * N)!) -> (2N! / N!) / N!

    /**
     * 8.3 - Write a method that returns all subsets of a set.
     */

    /**
     * 8.4 - Write a method to compute all permutations of a string.
     */
    // TODO
    public static ArrayList<String> getStringPermutations(final String prefix, final String string) {
        final ArrayList<String> permutations = new ArrayList<>();
        if (string == null || string.isEmpty()) {
            permutations.add(prefix);
        } else {
            int length = string.length();
            for (int i = 0; i < length; i++) {
                permutations.addAll(getStringPermutations(prefix + string.charAt(i), string.substring(i + 1, length) + string.substring(0, i)));
            }
        }
        return permutations;
    }


}
