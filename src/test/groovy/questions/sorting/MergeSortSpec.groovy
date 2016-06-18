package questions.sorting

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class MergeSortSpec extends Specification {

    def "mergeSort"() {
        given:
        def numbers = [2, 4, 6, 3, 1] as int[]

        when:
        MergeSort.mergeSort(numbers as int[], 0, numbers.length - 1)

        then:
        [1, 2, 3, 4, 6] as int[] == numbers as int[]
    }

    def "mergeSort2"() {
        given:
        def numbers = [2, 4, 6, 3, 1] as int[]

        when:
        numbers = MergeSort.mergeSort2(numbers as int[], 0, numbers.length - 1)

        then:
        [1, 2, 3, 4, 6] as int[] == numbers as int[]
    }

    def "sort"() {
        given:
        def numbers = [2, 4, 6, 3, 1] as int[]

        when:
        MergeSort.sort(numbers as int[])

        then:
        [1, 2, 3, 4, 6] as int[] == numbers as int[]
    }

    def "sort2"() {
        given:
        def numbers = [2, 4, 6, 3, 1] as int[]

        when:
        numbers = MergeSort.sort2(numbers as int[])

        then:
        [1, 2, 3, 4, 6] as int[] == numbers as int[]
    }
}
