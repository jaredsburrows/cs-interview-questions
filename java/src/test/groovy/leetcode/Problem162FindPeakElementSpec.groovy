package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem162FindPeakElementSpec extends Specification {
    @Unroll def "findPeakElement(#nums) = #answer"() {
        given:
        def sut = new Problem162FindPeakElement()

        expect:
        sut.findPeakElement(nums as int[]) == answer

        where:
        nums                  || answer
        [1, 2, 3, 1]          || 2
        [1, 2, 1, 3, 5, 6, 4] || 5
    }
}
