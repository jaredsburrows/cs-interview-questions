package questions.stringarraymatrix

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class RotateArraySpec extends Specification {

    def "rotate"() {
        expect:
        RotateArray.rotate(a as int[], b) == c as int[]

        where:
        a               | b  | c
        [1, 2, 3, 4, 5] | -1 | null
        null            | 1  | null
        [1, 2, 3, 4, 5] | 1  | [5, 1, 2, 3, 4]
        [1]             | 0  | [1]
    }
}
