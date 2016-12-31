package questions.stringarraymatrix

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class MergeSortedArraysSpec extends BaseSpec {

    def "test merge"() {
        expect:
        MergeSortedArrays.merge(a as int[], b as int[]) == c as int[]

        where:
        a         | b         | c
        null      | null      | null
        [1, 3, 5] | null      | [1, 3, 5]
        null      | [1, 3, 5] | [1, 3, 5]
        [1, 3, 5] | [2, 4, 6] | [1, 2, 3, 4, 5, 6]
        [1, 2, 3] | [4, 5, 6] | [1, 2, 3, 4, 5, 6]
        [3, 5, 6] | [1, 2, 4] | [1, 2, 3, 4, 5, 6]
    }
}
