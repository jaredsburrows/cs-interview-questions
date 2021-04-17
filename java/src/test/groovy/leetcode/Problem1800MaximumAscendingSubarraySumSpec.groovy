package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1800MaximumAscendingSubarraySumSpec extends Specification {
    @Unroll def 'maxAscendingSum(#nums) = #answer'() {
        given:
        def sut = new Problem1800MaximumAscendingSubarraySum()

        expect:
        sut.maxAscendingSum(nums as int[]) == answer

        where:
        nums                         || answer
        [10, 20, 30, 5, 10, 50]      || 65
        [10, 20, 30, 40, 50]         || 150
        [12, 17, 15, 13, 10, 11, 12] || 33
        [100, 10, 1]                 || 100
        [3, 6, 10, 1, 8, 9, 9, 8, 9] || 19
    }
}
