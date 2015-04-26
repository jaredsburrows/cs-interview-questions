package questions.stringarraymatrix

import spock.lang.Specification

class MergeSortedArraysSpec extends Specification {

    def "merge"() {
        given:
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays()

        expect:
        mergeSortedArrays.merge(a as int[], b as int[]) == c as int[]

        where:
        a         || b         || c
        null      || null      || null
        [1, 3, 5] || null      || [1, 3, 5]
        null      || [1, 3, 5] || [1, 3, 5]
        [1, 3, 5] || [2, 4, 6] || [1, 2, 3, 4, 5, 6]
        [1, 2, 3] || [4, 5, 6] || [1, 2, 3, 4, 5, 6]
        [3, 5, 6] || [1, 2, 4] || [1, 2, 3, 4, 5, 6]
    }
}
