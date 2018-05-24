package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem4544SumIISpec extends Specification {
    @Unroll def "fourSumCount(#A, #B, #C, #D) = #answer"() {
        given:
        def sut = new Problem4544SumII()

        expect:
        sut.fourSumCount(A as int[], B as int[], C as int[], D as int[]) == answer

        where:
        A      | B        | C       | D      || answer
        [1, 2] | [-2, -1] | [-1, 2] | [0, 2] || 2
    }
}
