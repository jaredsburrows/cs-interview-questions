package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1219PathWithMaximumGoldSpec extends Specification {
    @Unroll
    def 'getMaximumGold(#n) = #answer'() {
        given:
        def sut = new Problem1219PathWithMaximumGold()

        expect:
        sut.getMaximumGold(n as int[][]) == answer

        where:
        n                                                        || answer
        [[0, 6, 0], [5, 8, 7], [0, 9, 0]]                        || 24
        [[1, 0, 7], [2, 0, 6], [3, 4, 5], [0, 3, 0], [9, 0, 20]] || 28
    }
}
