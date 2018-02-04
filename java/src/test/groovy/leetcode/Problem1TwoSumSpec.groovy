package leetcode

import spock.lang.Unroll
import test.BaseSpec

final class Problem1TwoSumSpec extends BaseSpec {
    @Unroll def "twoSum"() {
        given:
        def sut = new Problem1TwoSum()

        expect:
        sut.twoSum(a as int[], b) == c as int[]

        where:
        a              | b || c
        null           | 0 || []
        []             | 0 || []
        [1, 1]         | 0 || []
        [2, 7, 11, 15] | 9 || [0, 1]
        [3, 2, 4]      | 6 || [1, 2]
    }
}
