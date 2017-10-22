package leetcode

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Problem125ValidPalindromeSpec extends Specification {
    @Unroll def "testIsPalindrome"() {
        expect:
        Problem125ValidPalindrome.isPalindrome(a) == b

        where:
        a                                || b
        null                             || true
//        "A man, a plan, a canal: Panama" || true
//        "race a car"                     || false
    }
}
