package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem53MaximumSubarraySpec extends Specification {
    @Unroll def 'maxSubArray(#nums) = #answer'() {
        given:
        def sut = new Problem53MaximumSubarray()

        expect:
        sut.maxSubArray(nums as int[]) == answer
        sut.maxSubArray2(nums as int[]) == answer

        where:
        nums                            || answer
        [-2, 1, -3, 4, -1, 2, 1, -5, 4] || 6
    }
}
