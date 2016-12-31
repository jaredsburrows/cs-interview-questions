package questions.stringarraymatrix

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class ReverseArraySpec extends BaseSpec {

    def "test reverse - multiple arg"() {
        expect:
        ReverseArray.reverse(a as int[], b, c) == d as int[]

        where:
        a                  | b | c | d
        null               | 2 | 2 | null
        [1]                | 2 | 2 | null
        [1, 2, 3, 4, 5, 6] | 4 | 5 | [1, 2, 3, 4, 6, 5]
    }
}
