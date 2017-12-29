package questions.stringarraymatrix

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class ReverseArraySpec extends BaseSpec {
    @Unroll def "reverse - multiple arg(#a, #b, #c) == '#d'"() {
        expect:
        ReverseArray.reverse(a as int[], b, c) == d as int[]

        where:
        a                  | b | c || d
        null               | 2 | 2 || []
        [1]                | 2 | 2 || [1]
        [1, 2, 3, 4, 5, 6] | 4 | 5 || [1, 2, 3, 4, 6, 5]
    }
}
