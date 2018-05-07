package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem66PlusOneSpec extends Specification {
    @Unroll def "plusOne(#digits) = #answer"() {
        given:
        def sut = new Problem66PlusOne()

        expect:
        sut.plusOne(digits as int[]) == answer as int[]

        where:
        digits       || answer
        [1, 2, 3]    || [1, 2, 4]
        [4, 3, 2, 1] || [4, 3, 2, 2]
    }
}
