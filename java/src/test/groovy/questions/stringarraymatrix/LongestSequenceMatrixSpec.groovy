package questions.stringarraymatrix

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class LongestSequenceMatrixSpec extends BaseSpec {
    @Unroll def "test getLongestSequence"() {
        expect:
        LongestSequenceMatrix.getLongestSequence(a as int[][]) == b

        where:
        a           || b
        null        || -1
        [[9, 8, 6],
         [1, 7, 4],
         [3, 5, 2]] || 3 // 9, 8, 7 - 1 case
        [[9, 1, 5],
         [8, 7, 4],
         [3, 6, 2]] || 4 // 9, 8, 7, 6 | 5, 4 - 2 cases
        [[9, 1, 5],
         [8, 3, 4],
         [7, 6, 2]] || 4 // 9, 8, 7, 6 | 5, 4, 3 - 2 cases
        [[9, 4, 3],
         [8, 5, 1],
         [7, 6, 2]] || 7 // 9, 8, 7, 6, 5, 4 | - 1 case
        [[9, 4, 3],
         [8, 5, 2],
         [7, 6, 1]] || 9 // 9, 8, 7, 6, 5, 4, 3, 2, 1 | - 1 case
    }
}
