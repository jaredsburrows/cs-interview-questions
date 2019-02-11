package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem240SearchA2DMatrixIISpec extends Specification {
    @Unroll def 'searchMatrix(#a, #b) = #answer'() {
        given:
        def sut = new Problem240SearchA2DMatrixII()

        expect:
        sut.searchMatrix(a as int[][], b) == answer

        where:
        a                      | b  || answer
        null                   | 0  || false
        [[]]                   | 0  || false
        [[1, 4, 7, 11, 15],
         [2, 5, 8, 12, 19],
         [3, 6, 9, 16, 22],
         [10, 13, 14, 17, 24],
         [18, 21, 23, 26, 30]] | 5  || true
        [[1, 4, 7, 11, 15],
         [2, 5, 8, 12, 19],
         [3, 6, 9, 16, 22],
         [10, 13, 14, 17, 24],
         [18, 21, 23, 26, 30]] | 20 || false
        [[-1], [-1]]           | -2 || false
        [[-5]]                 | -5 || true
    }
}
