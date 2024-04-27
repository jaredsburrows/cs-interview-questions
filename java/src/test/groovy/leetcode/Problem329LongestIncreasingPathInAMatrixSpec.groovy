package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem329LongestIncreasingPathInAMatrixSpec extends Specification {
    @Unroll
    def 'longestIncreasingPath(#n) = #answer'() {
        given:
        def sut = new Problem329LongestIncreasingPathInAMatrix()

        expect:
        sut.longestIncreasingPath(n as int[][]) == answer

        where:
        n                                 || answer
        [[9, 9, 4], [6, 6, 8], [2, 1, 1]] || 4
        [[3, 4, 5], [3, 2, 6], [2, 2, 1]] || 4
        [[1]]                             || 1
    }
}
