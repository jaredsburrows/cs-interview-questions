package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem153FindMinimumInRotatedSortedArraySpec extends Specification {
    @Unroll def "longestCommonPrefix(#nums) = #answer"() {
        given:
        def sut = new Problem153FindMinimumInRotatedSortedArray()

        expect:
        sut.findMin(nums as int[]) == answer

        where:
        nums                  || answer
        [3, 4, 5, 1, 2]       || 1
        [4, 5, 6, 7, 0, 1, 2] || 0
    }
}
