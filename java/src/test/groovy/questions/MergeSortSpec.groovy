package questions

import questions.MergeSort
import spock.lang.Specification

final class MergeSortSpec extends Specification {
    def 'mergeSort'() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        MergeSort.mergeSortIndex(actual as int[], 0, actual.length - 1)

        then:
        actual == expected
    }

    def 'mergeSort2'() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        actual = MergeSort.mergeSortIndex2(actual as int[], 0, actual.length - 1)

        then:
        actual == expected
    }

    def 'sort'() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        MergeSort.mergeSortArray(actual as int[])

        then:
        actual == expected
    }

    def 'sort2'() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        actual = MergeSort.mergeSortArray2(actual as int[])

        then:
        actual == expected
    }
}
