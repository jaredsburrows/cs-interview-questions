package leetcode

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class TwoSumSpec extends BaseSpec {

    @Unroll def "testTwoSum"() {
        expect:
        TwoSum.twoSum(a as int[], b) == c as int[]
        TwoSum.twoSum2(a as int[], b) == c as int[]
        TwoSum.twoSum3(a as int[], b) == c as int[]

        where:
        a              | b || c
        [1, 1]         | 0 || []
        [2, 7, 11, 15] | 9 || [0, 1]
        [3, 2, 4]      | 6 || [1, 2]
    }
}
