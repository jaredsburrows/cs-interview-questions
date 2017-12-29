package questions.sorting

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class BubbleSortSpec extends BaseSpec {
    def "sortDescending"() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [6, 4, 3, 2, 1] as int[]

        when:
        BubbleSort.sortDescending(actual)

        then:
        actual == expected
    }

    def "sortDescending2"() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [6, 4, 3, 2, 1] as int[]

        when:
        actual = BubbleSort.sortDescending2(actual)

        then:
        actual == expected
    }

    def "sort"() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        BubbleSort.sort(actual)

        then:
        actual == expected
    }

    def "sort2"() {
        given:
        def actual = [2, 4, 6, 3, 1] as int[]
        def expected = [1, 2, 3, 4, 6] as int[]

        when:
        actual = BubbleSort.sort2(actual)

        then:
        actual == expected
    }
}
