package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem33SearchInRotatedSortedArraySpec extends Specification {
    @Unroll def "longestCommonPrefix(#nums, #target) = #answer"() {
        given:
        def sut = new Problem33SearchInRotatedSortedArray()

        expect:
        sut.search(nums as int[], target) == answer

        where:
        nums                  | target || answer
        [4, 5, 6, 7, 0, 1, 2] | 0      || 4
        [4, 5, 6, 7, 0, 1, 2] | 3      || -1
    }
}
