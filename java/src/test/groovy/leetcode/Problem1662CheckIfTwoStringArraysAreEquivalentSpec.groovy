package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1662CheckIfTwoStringArraysAreEquivalentSpec extends Specification {
    @Unroll def 'arrayStringsAreEqual(#word1, #word2) = #answer'() {
        given:
        def sut = new Problem1662CheckIfTwoStringArraysAreEquivalent()

        expect:
        sut.arrayStringsAreEqual(word1 as String[], word2 as String[]) == answer
        sut.arrayStringsAreEqual2(word1 as String[], word2 as String[]) == answer

        where:
        word1                | word2        || answer
        ["ab", "c"]          | ["a", "bc"]  || true
        ["a", "cb"]          | ["ab", "c"]  || false
        ["abc", "d", "defg"] | ["abcddefg"] || true
    }
}
