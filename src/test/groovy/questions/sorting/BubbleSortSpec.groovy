package questions.sorting

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class BubbleSortSpec extends Specification {

    def "sortDescending"() {
        given:
        def numbers = [2, 4, 6, 3, 1] as int[]

        when:
        BubbleSort.sortDescending(numbers)

        then:
        [6, 4, 3, 2, 1] as int[] == numbers as int[]
    }

    def "sortDescending2"() {
        given:
        def numbers = [2, 4, 6, 3, 1] as int[]

        when:
        numbers = BubbleSort.sortDescending2(numbers as int[])

        then:
        [6, 4, 3, 2, 1] as int[] == numbers as int[]
    }

    def "sort"() {
        given:
        def numbers = [2, 4, 6, 3, 1] as int[]

        when:
        BubbleSort.sort(numbers)

        then:
        [1, 2, 3, 4, 6] as int[] == numbers as int[]
    }

    def "sort2"() {
        given:
        def numbers = [2, 4, 6, 3, 1] as int[]

        when:
        numbers = BubbleSort.sort2(numbers as int[])

        then:
        [1, 2, 3, 4, 6] as int[] == numbers as int[]
    }
}
