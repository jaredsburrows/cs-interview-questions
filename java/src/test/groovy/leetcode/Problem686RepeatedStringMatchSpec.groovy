package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem686RepeatedStringMatchSpec extends Specification {
    @Unroll def 'repeatedStringMatch(#A, #B) = #answer'() {
        given:
        def sut = new Problem686RepeatedStringMatch()

        expect:
        sut.repeatedStringMatch(A, B) == answer

        where:
        A      | B          || answer
        'abcd' | 'cdabcdab' || 3
    }
}
