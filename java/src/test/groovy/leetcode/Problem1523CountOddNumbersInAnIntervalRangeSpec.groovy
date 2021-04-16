package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1523CountOddNumbersInAnIntervalRangeSpec extends Specification {
    @Unroll def 'countOdds(#low, #high) = #answer'() {
        given:
        def sut = new Problem1523CountOddNumbersInAnIntervalRange()

        expect:
        sut.countOdds(low, high) == answer

        where:
        low       | high      || answer
        327296043 | 769434803 || 221069381
        3         | 7         || 3
        8         | 10        || 1
    }
}
