package api.util

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class SwapSpec extends Specification {

    def "swap"() {
        given:
        def numbers = [1, 2] as Integer[]

        when:
        Swap.swap(numbers, 0, 1)

        then:
        [2, 1] as int[] == numbers as int[]
    }
}
