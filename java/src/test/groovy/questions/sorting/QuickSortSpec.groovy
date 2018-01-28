package questions.sorting

import questions.QuickSort
import test.BaseSpec

final class QuickSortSpec extends BaseSpec {
    def "sortHelper"() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        QuickSort.sortHelper(actual as int[], 0, actual.length - 1)

        then:
        actual == expected
    }

    def "sort"() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        actual = QuickSort.sort(actual as int[], 0, actual.length - 1)

        then:
        actual == expected
    }

    def "sortHelper2"() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        QuickSort.sortHelper2(actual as int[], 0, actual.length - 1)

        then:
        actual == expected
    }

    def "sort2"() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        actual = QuickSort.sort2(actual as int[], 0, actual.length - 1)

        then:
        actual == expected
    }
}
