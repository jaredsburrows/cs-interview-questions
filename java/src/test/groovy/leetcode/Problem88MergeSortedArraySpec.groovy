package leetcode

import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll

final class Problem88MergeSortedArraySpec extends Specification {
    @Ignore
    @Unroll def 'merge(#nums1, #m, #nums2, #n)'() {
        given:
        def nums1 = [1, 2, 3, 0, 0, 0]
        def m = 3
        def nums2 = [2, 5, 6]
        def n = 3
        def sut = new Problem88MergeSortedArray()

        when:
        sut.merge(nums1 as int[], m, nums2 as int[], n)

        then:
        nums1 == [1, 2, 2, 3, 5, 6]
    }
}
