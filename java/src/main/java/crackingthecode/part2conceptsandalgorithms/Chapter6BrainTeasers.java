package crackingthecode.part2conceptsandalgorithms;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Chapter6BrainTeasers {
    /**
     * 6.1 - Add arithmetic operators (plus, minus, times, divide) to make the following expression
     * true: 3 1 3 6 = 8. You can use any parentheses you’d like.
     */
    public static double arithmeticOperators() {
        // int division = 0, use double
        return (3.0 + 1.0) / (3.0 / 6.0); // ((3 + 1) / 3) * 6 = 8
    }

    /**
     * 6.2 - There is an 8x8 chess board in which two diagonally opposite corners have been cut off.
     * You are given 31 dominos, and a single domino can cover exactly two squares. Can you use the 31
     * dominos to cover the entire board? Prove your answer (by providing an example, or showing why
     * it’s impossible).
     */
    public static int chessPieces() {
        // 1 domino     = 2 squares
        // 31 dominoes  = 62 squares
        // 8x8 grid     = 64 squares

        // 31 dominos cannot cover the entire board without the corners being removed
        // If each corner that was cut was exactly 1 or more squares then it can cover.

        // The book solution mentions 30 black and 32 white squares and said it is impossible
        // because of the colors(colors were not mentioned, only the board itself in the question).

        // The question did not say to "equally" cover the colors.

        return 8 * 8;
    }

    /**
     * 6.3 - You have a five quart jug and a three quart jug, and an unlimited supply of water (but no
     * measuring cups). How would you come up with exactly four quarts of water? NOTE: The jugs are
     * oddly shaped, such that filling up exactly ‘half’ of the jug would be impossible.
     */
    public static int exactJugs() {
        // Sine you have a 5 quart jug and a 3 quart jug, you can fill up the 5 quart jug and
        // use the 5 quart jug to full up the 3 quart jug. When the 3 quart jug is full, you know
        // that you have exactly 2 quarts.

        // You can repeat this process one more time to get 4 quarts of water.

        return (5 - 3) * 2;
    }

    /*
     * 6.4 - A bunch of men are on an island. A genie comes down and gathers everyone to- gether and
     * places a magical hat on some people’s heads (i.e., at least one person has a hat). The hat is
     * magical: it can be seen by other people, but not by the wearer of the hat himself. To remove
     * the hat, those (and only those who have a hat) must dunk themselves underwater at exactly
     * midnight. If there are n people and c hats, how long does it take the men to remove the hats?
     * The men cannot tell each other (in any way) that they have a hat.
     * FOLLOW UP
     * Prove that your solution is correct.
     */
    // n - people
    // c - hats, atleast one person has a hat

    /*
     * 6.5 - There is a building of 100 floors. If an egg drops from the Nth floor or above it will
     * break. If it’s dropped from any floor below, it will not break. You’re given 2 eggs. Find N,
     * while minimizing the number of drops for the worst case.
     */
    // 100 floors
    // if N >= break else !break
    // Only given 2 eggs

    // If we start from the bottom floor 1, first egg breaks at floor 2, then we know that N == 2

    /**
     * 6.6 - There are one hundred closed lockers in a hallway. A man begins by opening all one
     * hundred lockers. Next, he closes every second locker. Then he goes to every third locker and
     * closes it if it is open or opens it if it is closed (e.g., he toggles every third locker).
     * After his one hundredth pass in the hallway, in which he toggles only locker number one
     * hundred, how many lockers are open?
     */
    // Time - O(N), Space - O(N)
    public static int lockersOpen() {
        // 100 - open
        // 100/2 - 50 - closes every second locker

        // basic demonstration with 10:
        // |_| - open
        // |x| - closed
        // 10 - |_|_|_|_|_|_|_|_|_|_| - toggle 1
        // 5  - |_|x|_|x|_|x|_|x|_|x|  - toggle 2
        // 6  - |_|x|x|x|_|_|_|x|x|x|  - toggle 3
        // 4  - |_|x|x|_|_|_|_|_|x|x|  - toggle 4
        // 4  - |_|x|x|_|x|_|_|_|x|_|  - toggle 5
        // 5  - |_|x|x|_|x|x|_|_|x|_|  - toggle 6
        // 6  - |_|x|x|_|x|x|x|_|x|_|  - toggle 7
        // 7  - |_|x|x|_|x|x|x|x|x|_|  - toggle 8
        // 6  - |_|x|x|_|x|x|x|x|_|_|  - toggle 9
        // 7  - |_|x|x|_|x|x|x|x|_|x|  - toggle 10

        // "After his one hundredth pass in the hallway", he repeated 100 times?

        final int numLockers = 100;
        final boolean[] lockers = new boolean[numLockers];
        int toggleCount = 1; // you can't divide 0 /0 - (0 % 0), must be greater than 1
        int openLockers = 0;

        // Toggle lockers
        while (toggleCount < numLockers) {

            for (int i = 0; i < numLockers; i++) {
                if (i % toggleCount == 0) {
                    lockers[i] = !lockers[i];
                }
            }

            toggleCount++;
        }

        // Count open lockers
        for (boolean bool : lockers) {
            if (bool) {
                openLockers++;
            }
        }

        return openLockers;
    }
}
