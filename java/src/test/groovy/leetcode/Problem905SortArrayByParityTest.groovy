package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem905SortArrayByParityTest extends Specification {
    @Unroll def "sortArrayByParity(#A) = #answer"() {
        given:
        def sut = new Problem905SortArrayByParity()

        expect:
        sut.sortArrayByParity(A as int[]) == answer as int[]

        where:
        A            || answer
        [0]          || [0]
        [0, 2]       || [0, 2]
        [3, 1, 2, 4] || [4, 2, 1, 3]
    }
}
