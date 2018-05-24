package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem125ValidPalindromeSpec extends Specification {
    @Unroll def "isPalindrome(#a) = #answer"() {
        given:
        def sut = new Problem125ValidPalindrome()

        expect:
        sut.isPalindrome(a) == answer

        where:
        a                                || answer
        null                             || false
        "A man, a plan, a canal: Panama" || true
        "race a car"                     || false
    }
}
