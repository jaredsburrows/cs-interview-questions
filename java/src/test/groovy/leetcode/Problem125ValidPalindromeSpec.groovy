package leetcode

import spock.lang.Specification
import spock.lang.Unroll

@SuppressWarnings("GroovyPointlessBoolean")
final class Problem125ValidPalindromeSpec extends Specification {
    @Unroll def "isPalindrome"() {
        given:
        def sut = new Problem125ValidPalindrome()

        expect:
        sut.isPalindrome(a) == b

        where:
        a                                || b
        null                             || false
        "A man, a plan, a canal: Panama" || true
        "race a car"                     || false
    }
}
