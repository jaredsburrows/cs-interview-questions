package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem961NRepeatedElementInSize2NArraySpec extends Specification {
    @Unroll def 'repeatedNTimes(#A) = #answer'() {
        given:
        def sut = new Problem961NRepeatedElementInSize2NArray()

        expect:
        sut.repeatedNTimes(nums as int[]) == answer
        sut.repeatedNTimes2(nums as int[]) == answer

        where:
        nums                     || answer
        [1, 2, 3, 3]             || 3
        [2, 1, 2, 5, 3, 2]       || 2
        [5, 1, 5, 2, 5, 3, 5, 4] || 5
    }
}
