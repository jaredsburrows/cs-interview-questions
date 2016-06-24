package api.util

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class SwapSpec extends Specification {

    def "swap"() {
        given:
        def actual = [1, 2] as Integer[]
        def expected = [2, 1] as int[]

        when:
        Swap.swap(actual, 0, 1)

        then:
        actual as int[] == expected
    }
}
