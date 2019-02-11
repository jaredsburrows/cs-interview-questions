package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem367ValidPerfectSquareSpec extends Specification {
    @Unroll def 'isPerfectSquare(#num) = #answer'() {
        given:
        def sut = new Problem367ValidPerfectSquare()

        expect:
        sut.isPerfectSquare(num) == answer

        where:
        num || answer
        16  || true
        14  || false
    }
}
