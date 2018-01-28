package questions.stringarraymatrix

import spock.lang.Unroll
import test.BaseSpec

final class MergeSortedArraysSpec extends BaseSpec {
    @Unroll def "merge(#a, #b) == '#c'"() {
        expect:
        MergeSortedArrays.merge(a as int[], b as int[]) == c as int[]

        where:
        a         | b         || c
        null      | null      || []
        [1, 3, 5] | null      || [1, 3, 5]
        null      | [1, 3, 5] || [1, 3, 5]
        [1, 3, 5] | [2, 4, 6] || [1, 2, 3, 4, 5, 6]
        [1, 2, 3] | [4, 5, 6] || [1, 2, 3, 4, 5, 6]
        [3, 5, 6] | [1, 2, 4] || [1, 2, 3, 4, 5, 6]
    }
}
