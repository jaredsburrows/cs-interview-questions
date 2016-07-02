package questions.stringarraymatrix

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class ReverseArraySpec extends Specification {

    def "reverse - multiple arg"() {
        expect:
        ReverseArray.reverse(a as int[], b, c) == d as int[]

        where:
        a                  | b | c | d
        null               | 2 | 2 | null
        [1]                | 2 | 2 | null
        [1, 2, 3, 4, 5, 6] | 4 | 5 | [1, 2, 3, 4, 6, 5]
    }
}
