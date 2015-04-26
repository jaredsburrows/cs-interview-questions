package questions.dynamicprogramming

import spock.lang.Specification

class MaxSubArraySpec extends Specification {

    def "getMax"() {
        given:
        MaxSubArray maxSubArray = new MaxSubArray()

        expect:
        maxSubArray.getMax(a as int[]) == b

        where:
        a                               || b
        null                            || -1
        [-2, 1, -3, 4, -1, 2, 1, -5, 4] || 6 // [4,−1,2,1]
    }

}
