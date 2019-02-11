package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem69SqrtSpec extends Specification {
    @Unroll def 'mySqrt(#x) = #answer'() {
        given:
        def sut = new Problem69Sqrt()

        expect:
        sut.mySqrt(x) == answer

        where:
        x || answer
        4 || 2
        8 || 2
    }
}
