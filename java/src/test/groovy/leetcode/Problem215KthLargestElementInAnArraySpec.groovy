package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem215KthLargestElementInAnArraySpec extends Specification {
    @Unroll def 'findKthLargest(#nums, #k) = #answer'() {
        given:
        def sut = new Problem215KthLargestElementInAnArray()

        expect:
        sut.findKthLargest(nums as int[], k) == answer

        where:
        nums                        | k || answer
        [3, 2, 1, 5, 6, 4]          | 2 || 5
        [3, 2, 3, 1, 2, 4, 5, 5, 6] | 4 || 4
    }
}
