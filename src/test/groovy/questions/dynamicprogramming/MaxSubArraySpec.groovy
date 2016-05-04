package questions.dynamicprogramming

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class MaxSubArraySpec extends Specification {

    def "getMax"() {
        expect:
        MaxSubArray.getMax(a as int[]) == b

        where:
        a                               || b
        null                            || -1
        [-2, 1, -3, 4, -1, 2, 1, -5, 4] || 6 // [4,−1,2,1]
    }
}
