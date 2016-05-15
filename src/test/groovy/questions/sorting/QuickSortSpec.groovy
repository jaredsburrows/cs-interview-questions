package questions.sorting

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class QuickSortSpec extends Specification {

    def "constructor"() {
        expect:
        new QuickSort() != null
    }

    def "sort"() {
        given:
        def numbers = [2, 4, 6, 3, 1] as int[]

        when:
        QuickSort.sort(numbers as int[], 0, numbers.length - 1)

        then:
        [1, 2, 3, 4, 6] as int[] == numbers as int[]
    }

    def "sort2"() {
        given:
        def numbers = [2, 4, 6, 3, 1] as int[]

        when:
        numbers = QuickSort.sort2(numbers as int[], 0, numbers.length - 1)

        then:
        [1, 2, 3, 4, 6] as int[] == numbers as int[]
    }
}
