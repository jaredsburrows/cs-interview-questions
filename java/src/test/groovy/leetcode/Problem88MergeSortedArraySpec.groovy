package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem88MergeSortedArraySpec extends Specification {
    @Unroll def 'merge(#nums1, #m, #nums2, #n) = #answer'() {
        given:
        def sut = new Problem88MergeSortedArray()

        expect:
        sut.merge(nums1 as int[], m, nums2 as int[], n)

        where:
        nums1              | m | nums2     | n || answer
        [1, 2, 3, 0, 0, 0] | 3 | [2, 5, 6] | 3 || [1, 2, 2, 3, 5, 6]
    }
}
