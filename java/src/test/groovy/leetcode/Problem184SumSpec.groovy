package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem184SumSpec extends Specification {
    @Unroll def "fourSum(#nums, #target) = #answer"() {
        given:
        def sut = new Problem184Sum()

        expect:
        sut.fourSum(nums as int[], target) == answer

        where:
        nums                 | target || answer
        [1, 0, -1, 0, -2, 2] | 0      || [[-2, -1, 1, 2],
                                          [-2, 0, 0, 2],
                                          [-1, 0, 0, 1]]
    }
}
