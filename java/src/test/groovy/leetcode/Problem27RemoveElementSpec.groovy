package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem27RemoveElementSpec extends Specification {
    @Unroll def 'removeElement(#nums, #val) = #answer'() {
        given:
        def sut = new Problem27RemoveElement()

        expect:
        sut.removeElement(nums as int[], val) == answer

        where:
        nums                     | val || answer
        [3, 2, 2, 3]             | 3   || 2
        [0, 1, 2, 2, 3, 0, 4, 2] | 2   || 5
    }
}
