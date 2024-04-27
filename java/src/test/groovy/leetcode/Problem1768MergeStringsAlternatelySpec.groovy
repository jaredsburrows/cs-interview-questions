package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1768MergeStringsAlternatelySpec extends Specification {
    @Unroll def 'mergeAlternately(#word1, #word2) = #answer'() {
        given:
        def sut = new Problem1768MergeStringsAlternately()

        expect:
        sut.mergeAlternately(word1, word2) == answer
        sut.mergeAlternately2(word1, word2) == answer
        sut.mergeAlternately3(word1, word2) == answer

        where:
        word1  | word2  || answer
        "abc"  | "pqr"  || "apbqcr"
        "ab"   | "pqrs" || "apbqrs"
        "abcd" | "pq"   || "apbqcd"
    }
}
