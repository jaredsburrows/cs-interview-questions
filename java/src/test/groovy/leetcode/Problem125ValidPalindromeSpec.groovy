package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem125ValidPalindromeSpec extends Specification {
    @Unroll def "isPalindrome"() {
        expect:
        Problem125ValidPalindrome.isPalindrome(a) == b

        where:
        a                                || b
        null                             || false
        "A man, a plan, a canal: Panama" || true
        "race a car"                     || false
    }
}
