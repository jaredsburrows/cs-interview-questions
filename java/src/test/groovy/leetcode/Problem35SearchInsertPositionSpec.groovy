package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem35SearchInsertPositionSpec extends Specification {
    @Unroll def "searchInsert(#nums, #target) = #answer"() {
        given:
        def sut = new Problem35SearchInsertPosition()

        expect:
        sut.searchInsert(nums as int[], target) == answer

        where:
        nums         | target || answer
        [1, 3, 5, 6] | 5      || 2
        [1, 3, 5, 6] | 2      || 1
        [1, 3, 5, 6] | 7      || 4
        [1, 3, 5, 6] | 0      || 0
    }
}
