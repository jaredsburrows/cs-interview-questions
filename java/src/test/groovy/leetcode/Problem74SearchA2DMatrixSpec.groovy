package leetcode

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@SuppressWarnings("GroovyPointlessBoolean")
final class Problem74SearchA2DMatrixSpec extends Specification {
    @Unroll def "searchMatrix"() {
        expect:
        Problem74SearchA2DMatrix.searchMatrix(a as int[][], b) == c

        where:
        a                      | b  || c
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
