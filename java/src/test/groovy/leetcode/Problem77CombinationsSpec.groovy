package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem77CombinationsSpec extends Specification {
    @Unroll def 'combine(#n, #k) = #answer'() {
        given:
        def sut = new Problem77Combinations()

        expect:
        sut.combine(n, k) == answer

        where:
        n | k || answer
        4 | 2 || [[1, 2],
                  [1, 3],
                  [1, 4],
                  [2, 3],
                  [2, 4],
                  [3, 4]]
    }
}
