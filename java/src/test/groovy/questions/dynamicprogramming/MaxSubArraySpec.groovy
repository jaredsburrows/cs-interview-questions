package questions.dynamicprogramming

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class MaxSubArraySpec extends BaseSpec {
    @Unroll def "maxSubArray(#a) == '#b'"() {
        expect:
        MaxSubArray.maxSubArray(a as int[]) == b

        where:
        a                               || b
        null                            || 0
        []                              || 0
        [1, 2, 3, 4]                    || 10
        [2, -1, 2, 3, 4, -5]            || 10
        [-2, 1, -3, 4, -1, 2, 1, -5, 4] || 6 // [4,−1,2,1]
    }

    @Unroll def "maxNonContSubArray(#a) == '#b'"() {
        expect:
        MaxSubArray.maxNonContSubArray(a as int[]) == b

        where:
        a                    || b
        null                 || -1
        [1, 2, 3, 4]         || 10
        [2, -1, 2, 3, 4, -5] || 11
        [-1, 0, 1]           || 1
    }
}
