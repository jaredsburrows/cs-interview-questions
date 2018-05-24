package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem9PalindromeNumberSpec extends Specification {
    @Unroll def "isPalindrome(#x) = #answer"() {
        given:
        def sut = new Problem9PalindromeNumber()

        expect:
        sut.isPalindrome(x) == answer

        where:
        x    || answer
        121  || true
        -121 || false
        10   || false
    }

    @Unroll def "isPalindrome2(#x) = #answer"() {
        given:
        def sut = new Problem9PalindromeNumber()

        expect:
        sut.isPalindrome2(x) == answer

        where:
        x    || answer
        121  || true
        -121 || false
        10   || false
    }
}
