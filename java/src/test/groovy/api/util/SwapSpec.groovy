package api.util

import spock.lang.Specification

final class SwapSpec extends Specification {
    def 'swap'() {
        given:
        def actual = [1, 2] as Integer[]
        def expected = [2, 1] as Integer[]

        when:
        Swap.swap(actual, 0, 1)

        then:
        actual as int[] == expected as int[]
    }

    def 'swap elements in the middle of an array'() {
        given:
        def actual = [1, 2, 3, 4] as Integer[]
        def expected = [1, 3, 2, 4] as Integer[]

        when:
        Swap.swap(actual, 1, 2)

        then:
        actual as int[] == expected as int[]
    }

    def 'swap elements in a larger array'() {
        given:
        def actual = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] as Integer[]
        def expected = [1, 2, 3, 4, 5, 10, 7, 8, 9, 6] as Integer[]

        when:
        Swap.swap(actual, 5, 9)

        then:
        actual as int[] == expected as int[]
    }

    def 'swap the same element (no-op)'() {
        given:
        def actual = [1, 2, 3, 4] as Integer[]
        def expected = [1, 2, 3, 4] as Integer[]

        when:
        Swap.swap(actual, 2, 2)

        then:
        actual as int[] == expected as int[]
    }

    def 'swap elements in an array of strings'() {
        given:
        def actual = ["a", "b", "c", "d"] as String[]
        def expected = ["a", "c", "b", "d"] as String[]

        when:
        Swap.swap(actual, 1, 2)

        then:
        actual as String[] == expected as String[]
    }
}
