package questions.sorting

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class QuickSortSpec extends BaseSpec {

    def "test sortHelper"() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        QuickSort.sortHelper(actual as int[], 0, actual.length - 1)

        then:
        actual == expected
    }

    def "test sort"() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        actual = QuickSort.sort(actual as int[], 0, actual.length - 1)

        then:
        actual == expected
    }

    def "test sortHelper2"() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        QuickSort.sortHelper2(actual as int[], 0, actual.length - 1)

        then:
        actual == expected
    }

    def "test sort2"() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        actual = QuickSort.sort2(actual as int[], 0, actual.length - 1)

        then:
        actual == expected
    }
}
