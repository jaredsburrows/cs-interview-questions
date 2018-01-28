package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem136SingleNumberSpec extends Specification {
    @Unroll def "singleNumber"() {
        expect:
        Problem136SingleNumber.singleNumber(a as int[]) == b

        where:
        a                           || b
        null                        || 0
        [1, 1, 2, 2, 3, 4, 4, 5, 5] || 3
    }
}
