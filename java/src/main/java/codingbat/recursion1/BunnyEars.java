package codingbat.recursion1;

/**
 * https://codingbat.com/prob/p183649
 */
public final class BunnyEars {
    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }

        return bunnyEars(bunnies - 1) + 2;
    }
}
