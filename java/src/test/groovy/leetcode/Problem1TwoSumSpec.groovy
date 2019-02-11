package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1TwoSumSpec extends Specification {
    @Unroll def 'twoSum(#nums, #target) = #answer'() {
        given:
        def sut = new Problem1TwoSum()

        expect:
        sut.twoSum(nums as int[], target) == answer as int[]

        where:
        nums           | target || answer
        null           | 0      || []
        []             | 0      || []
        [1, 1]         | 0      || []
        [3, 2, 4]      | 6      || [1, 2]
        [2, 7, 11, 15] | 9      || [0, 1]
    }
}
