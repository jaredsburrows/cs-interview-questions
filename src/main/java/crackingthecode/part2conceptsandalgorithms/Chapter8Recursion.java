package crackingthecode.part2conceptsandalgorithms;

import api.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class Chapter8Recursion {

    /**
     * 8.1 - Write a method to generate the nth Fibonacci number.
     */
    public static long getFibNumberRecursive(final long number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else if (number <= 2) {
            return 1;
        } else {
            return (getFibNumberRecursive(number - 1) + getFibNumberRecursive(number - 2));
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
    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> initial, int size) {
        if (initial == null || size < 0) {
            return null;
        }

        ArrayList<ArrayList<Integer>> finalList;
        if (initial.size() == size) {
            // empty set
            finalList = new ArrayList<>();
            finalList.add(new ArrayList<>());
        } else {
            finalList = getSubsets(initial, size + 1);
            ArrayList<ArrayList<Integer>> newSetList = new ArrayList<>();
            for (ArrayList<Integer> set : finalList) {
                // new set is being created
                ArrayList<Integer> temp = new ArrayList<>();
                temp.addAll(set);
                temp.add(initial.get(size));
                newSetList.add(temp);
            }

            // add to final list
            finalList.addAll(newSetList);
        }
        return finalList;
    }

    /**
     * 8.4 - Write a method to compute all permutations of a string.
     */
    public static ArrayList<String> getStringPermutations(String prefix, String string) {
        if (string == null) {
            return null;
        }

        ArrayList<String> finalList = new ArrayList<>();
        int length = string.length();
        if (length == 0) {
            // empty string
            finalList.add(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                // add to final list
                finalList.addAll(getStringPermutations(prefix + string.charAt(i), string.substring(i + 1, length) + string.substring(0, i)));
            }
        }

        return finalList;
    }

    /**
     * 8.5 - Implement an algorithm to print all valid (e.g., properly opened and closed)
     * combi- nations of n-pairs of parentheses.
     * EXAMPLE:
     * input: 3 (e.g., 3 pairs of parentheses)
     * output: ()()(), ()(()), (())(), ((()))
     */
    public static List<String> getValidParentheses(int pairs, int left, int right, String pairString) {
        if (pairs < 1 || left < 0 || right < 0 || pairString == null) {
            return null;
        }

        ArrayList<String> generatedList = new ArrayList<>();

        if (right == pairs) {
            generatedList.add(pairString);
        }

        // make sure left is not greater than number of pairs
        if (left < pairs) {
            generatedList.addAll(getValidParentheses(pairs, left + 1, right, pairString + "("));
        }

        // make sure right is not greater than number of pairs
        // make sure right is left than left, (()
        if ((right < pairs) && (right < left)) {
            generatedList.addAll(getValidParentheses(pairs, left, right + 1, pairString + ")"));
        }

        return generatedList;
    }

    // the book question is missing - (()())
    public static void generatedValidParentheses(int pairs, int left, int right, String pairString) {
        if (pairs < 1 || left < 0 || right < 0 || pairString == null) {
            return;
        }

        if (right == pairs) {
            System.out.println(pairString);
        }

        // make sure left is not greater than number of pairs
        if (left < pairs) {
            getValidParentheses(pairs, left + 1, right, pairString + "(");
        }

        // make sure right is not greater than number of pairs
        // make sure right is left than left, (()
        if ((right < pairs) && (right < left)) {
            getValidParentheses(pairs, left, right + 1, pairString + ")");
        }
    }

    /**
     * 8.6 - Implement the “paint fill” function that one might see on many image editing programs.
     * That is, given a screen (represented by a 2-dimensional array of Colors), a point, and a new
     * color, fill in the surrounding area until you hit a border of that color.
     */
    public static void paintFill(Color[][] pixels, int x, int y, Color oldcolor, Color newColor) {
        if (x < 0 || x >= pixels[0].length || y < 0 || y >= pixels.length) {
            return;
        }

        if (pixels[x][y] != oldcolor) {
            return;
        }
        pixels[x][y] = newColor;
        paintFill(pixels, x + 1, y, oldcolor, newColor); // right
        paintFill(pixels, x - 1, y, oldcolor, newColor); // left
        paintFill(pixels, x, y + 1, oldcolor, newColor); // down
        paintFill(pixels, x, y - 1, oldcolor, newColor); // up
    }

    public static void paintFill(Color[][] pixels, int x, int y, Color newColor) {
        Color oldcolor = pixels[x][y];
        paintFill(pixels, x, y, oldcolor, newColor);
    }

    public static void floodFillUtil(int screen[][], int x, int y, int prevC, int newC) {
        // Base cases
        if (x < 0 || x >= 8 || y < 0 || y >= 8) {
            return;
        }
        if (screen[x][y] != prevC) {
            return;
        }

        // Replace the color at (x, y)
        screen[x][y] = newC;

        // Recur for north, east, south and west
        floodFillUtil(screen, x + 1, y, prevC, newC);
        floodFillUtil(screen, x - 1, y, prevC, newC);
        floodFillUtil(screen, x, y + 1, prevC, newC);
        floodFillUtil(screen, x, y - 1, prevC, newC);
    }

    public static void floodFill(int screen[][], int x, int y, int newC) {
        int prevC = screen[x][y];
        floodFillUtil(screen, x, y, prevC, newC);
    }

    /**
     * 8.7 - Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents)
     * and pennies (1 cent), write code to calculate the number of ways of representing n cents.
     */
    // number of ways
    // dollar   == 100  cents
    // quarter  == 25   cents
    // dimes    == 10   cents
    // nickels  == 5    cents
    // pennies  == 1    cent
    public static int getRepresentCents(int cents, int denomination) {
        if (cents < 2) {
            return 1;
        }

//        if (denomination != 25 || denomination != 10 || denomination != 5 || denomination != 1) {
//            return -1;
//        }

        int count = 0;
        int nextDenomination = 0;

        if (denomination == 25) {
            nextDenomination = 10;
        }

        if (denomination == 10) {
            nextDenomination = 5;
        }

        if (denomination == 5) {
            nextDenomination = 1;
        }

        if (denomination == 1) {
            // add 1
            return 1;
        }

        // 4 * 25 < 100
        // 0 quarters, 0 * 25 = 0, other smaller denominations
        // 1 quarter, 1 * 25 = 25, other denominations
        // 2 quarters, 2 * 25 = 50, other denominations
        // 3 quarters, 3 * 25 = 75, other denominations
        // 4 quarters, 4 * 25 = 100, 4 quarters
        for (int i = 0; i * denomination <= cents; i++) {
            count += getRepresentCents(cents - (i * denomination), nextDenomination);
        }

        return count;
    }

    // Book answer
    public static int makeChange(int n, int denom) {
        int next_denom = 0;
        switch (denom) {
            case 25:
                next_denom = 10;
                break;
            case 10:
                next_denom = 5;
                break;
            case 5:
                next_denom = 1;
                break;
            case 1:
                return 1;
        }

        int ways = 0;
        for (int i = 0; i * denom <= n; i++) {
            ways += makeChange(n - i * denom, next_denom);
        }
        return ways;
    }

    /**
     * 8.8 - Write an algorithm to print all ways of arranging eight queens on a chess board so that
     * none of them share the same row, column or diagonal.
     */
    // TODO

}
