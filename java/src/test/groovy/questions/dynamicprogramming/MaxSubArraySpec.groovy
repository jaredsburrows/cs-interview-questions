package questions.dynamicprogramming

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class MaxSubArraySpec extends BaseSpec {
    @Unroll def "test getMax"() {
        expect:
        MaxSubArray.getMax(a as int[]) == b

        where:
        a                               || b
        null                            || -1
        [-2, 1, -3, 4, -1, 2, 1, -5, 4] || 6 // [4,−1,2,1]
    }

    @Unroll def "test maxContSubArray"() {
        expect:
        MaxSubArray.maxContSubArray(a as int[]) == b

        where:
        a                    || b
        null                 || -1
        [1, 2, 3, 4]         || 10
        [2, -1, 2, 3, 4, -5] || 10
    }

    @Unroll def "test maxNonContSubArray"() {
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
