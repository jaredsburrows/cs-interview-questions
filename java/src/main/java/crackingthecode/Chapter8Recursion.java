package crackingthecode;

import api.Color;
import java.util.ArrayList;
import java.util.List;

public final class Chapter8Recursion {
    /**
     * 8.1 - Write a method to generate the nth Fibonacci number.
     */
    public long getFibNumberRecursive(long number) {
        if (number < 2) {
            return number;
        }

        return getFibNumberRecursive(number - 1) + getFibNumberRecursive(number - 2);
    }

    public long getFibNumberIterative(long number) {
        if (number < 0) {
            return number;
        }

        if (number == 0) {
            return 0;
        }

        if (number <= 2) {
            return 1;
        }

        int first = 1;
        int second = 1;
        int third = 0;

        for (int i = 3; i <= number; i++) {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }

    /*
     * 8.2 - Imagine a robot sitting on the upper left hand corner of an NxN grid. The robot can
     * only move in two directions: right and down. How many possible paths are there for the robot?
     * FOLLOW UP
     * Imagine certain squares are “off limits”, such that the robot can not step on them. Design an
     * algorithm to get all possible paths for the robot.
     */
    // http://artofproblemsolving.com/community/c21002t54378f21002h1058853_lattice_paths
    // - n!/(r! * (n - r)!), N = 20, (40 20) - 40!/(20! * (40 - 20)!) - (20 * 2!/20!)/20! - > (21 -> 40)/20!
    // 2N! / (N! * (2N * N)!) -> (2N! / N!) / N!

    /**
     * 8.3 - Write a method that returns all subsets of a set.
     */
    public List<List<Integer>> getSubsets(List<Integer> initial, int size) {
        if (initial == null || size < 0) {
            return new ArrayList<>();
        }

        final List<List<Integer>> finalList;
        if (initial.size() == size) {
            // empty set
            finalList = new ArrayList<>();
            finalList.add(new ArrayList<>());
        } else {
            finalList = getSubsets(initial, size + 1);
            final List<ArrayList<Integer>> newSetList = new ArrayList<>();
            for (List<Integer> set : finalList) {
                // new set is being created
                final ArrayList<Integer> temp = new ArrayList<>();
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
    public List<String> getStringPermutations(String prefix, String string) {
        if (string == null) {
            return new ArrayList<>();
        }

        final List<String> finalList = new ArrayList<>();
        final int length = string.length();
        if (length == 0) {
            // empty string
            finalList.add(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                // add to final list
                finalList.addAll(
                    getStringPermutations(prefix + string.charAt(i), string.substring(i + 1, length)
                        + string.substring(0, i)));
            }
        }

        return finalList;
    }

    /**
     * 8.5 - Implement an algorithm to print all valid (e.g., properly opened and closed) combi-
     * nations of n-pairs of parentheses. EXAMPLE: input: 3 (e.g., 3 pairs of parentheses) output:
     * ()()(), ()(()), (())(), ((()))
     */
    public List<String> getValidParentheses(int pairs, int left, int right,
                                            String pairString) {
        if (pairs < 1 || left < 0 || right < 0 || pairString == null) {
            return new ArrayList<>();
        }

        final List<String> generatedList = new ArrayList<>();

        if (right == pairs) {
            generatedList.add(pairString);
        }

        // make sure left is not greater than number of pairs
        if (left < pairs) {
            final List<String> next = getValidParentheses(pairs, left + 1, right, pairString + "(");
            if (!next.isEmpty()) {
                generatedList.addAll(next);
            }
        }

        // make sure right is not greater than number of pairs
        // make sure right is left than left, (()
        if (right < pairs && right < left) {
            final List<String> next = getValidParentheses(pairs, left, right + 1, pairString + ")");
            if (!next.isEmpty()) {
                generatedList.addAll(next);
            }
        }

        return generatedList;
    }

    /**
     * 8.6 - Implement the “paint fill” function that one might see on many image editing programs.
     * That is, given a screen (represented by a 2-dimensional array of Colors), a point, and a new
     * color, fill in the surrounding area until you hit a border of that color.
     */
    public void paintFill(Color[][] pixels, int positionX, int positionY,
                          Color prevColor, Color newColor) {
        if (positionX < 0
            || positionX >= pixels[0].length
            || positionY < 0
            || positionY >= pixels.length) {
            return;
        }

        if (pixels[positionX][positionY] != prevColor) {
            return;
        }

        // Replace the color at (x, y)
        pixels[positionX][positionY] = newColor;

        // Recurse for north, east, south and west
        paintFill(pixels, positionX + 1, positionY, prevColor, newColor); // right
        paintFill(pixels, positionX - 1, positionY, prevColor, newColor); // left
        paintFill(pixels, positionX, positionY + 1, prevColor, newColor); // down
        paintFill(pixels, positionX, positionY - 1, prevColor, newColor); // up
    }

    public void paintFill(Color[][] pixels, int positionX, int positionY, Color newColor) {
        final Color oldColor = pixels[positionX][positionY];

        paintFill(pixels, positionX, positionY, oldColor, newColor);
    }

    public void floodFillUtil(int[][] screen, int positionX, int positionY,
                              int prevColor, int newColor) {
        // Base cases
        if (positionX < 0 || positionX >= 8) {
            return;
        }

        if (positionY < 0 || positionY >= 8) {
            return;
        }

        if (screen[positionX][positionY] != prevColor) {
            return;
        }

        // Replace the color at (x, y)
        screen[positionX][positionY] = newColor;

        // Recurse for north, east, south and west
        floodFillUtil(screen, positionX + 1, positionY, prevColor, newColor);
        floodFillUtil(screen, positionX - 1, positionY, prevColor, newColor);
        floodFillUtil(screen, positionX, positionY + 1, prevColor, newColor);
        floodFillUtil(screen, positionX, positionY - 1, prevColor, newColor);
    }

    public void floodFill(int[][] screen, int positionX, int positionY,
                          final int newColor) {
        final int oldColor = screen[positionX][positionY];

        floodFillUtil(screen, positionX, positionY, oldColor, newColor);
    }

    /**
     * 8.7 - Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents) and
     * pennies (1 cent), write code to calculate the number of ways of representing n cents.
     */
    // number of ways
    // dollar   == 100  cents
    // quarter  == 25   cents
    // dimes    == 10   cents
    // nickels  == 5    cents
    // pennies  == 1    cent
    public int getRepresentCents(int cents, int denomination) {
        if (cents < 2) {
            return 1;
        }

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
    public int makeChange(int number, int denom) {
        int nextDenom;

        switch (denom) {
            case 25:
                nextDenom = 10;
                break;
            case 10:
                nextDenom = 5;
                break;
            case 5:
                nextDenom = 1;
                break;
            default:
            case 1:
                return 1;
        }

        int ways = 0;
        for (int i = 0; i * denom <= number; i++) {
            ways += makeChange(number - i * denom, nextDenom);
        }
        return ways;
    }

    /*
     * 8.8 - Write an algorithm to print all ways of arranging eight queens on a chess board so that
     * none of them share the same row, column or diagonal.
     */
}
