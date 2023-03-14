package codingbat.recursion1;

/**
 * https://codingbat.com/prob/p107330
 */
public final class BunnyEars2 {
    public int bunnyEars2(int bunnies) {
        if (bunnies <= 0) {
            return 0;
        }

        if (bunnies % 2 == 0) {
            return bunnyEars2(bunnies - 1) + 3;
        } else {
            return bunnyEars2(bunnies - 1) + 2;
        }
    }
}
