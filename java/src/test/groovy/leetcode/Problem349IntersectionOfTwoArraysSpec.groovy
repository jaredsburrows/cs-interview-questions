package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem349IntersectionOfTwoArraysSpec extends Specification {
    @Unroll def "intersection(#nums1, #nums2) = #answer"() {
        given:
        def sut = new Problem349IntersectionOfTwoArrays()

        expect:
        sut.intersection(nums1 as int[], nums2 as int[]) == answer as int[]

        where:
        nums1        | nums2  || answer
        [1, 2, 2, 1] | [2, 2] || [2]
    }
}
