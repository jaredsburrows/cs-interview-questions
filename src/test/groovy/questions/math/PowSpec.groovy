package questions.math

import test.BaseSpec
/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class PowSpec extends BaseSpec {

    def "pow"() {
        expect:
        Pow.pow(a, b) == c

        where:
        a  | b  | c
        -2 | 2  | 4
        -1 | 5  | -1
        -1 | -1 | 0
        0  | 0  | 0
        1  | 1  | 1
        2  | 1  | 2
        2  | 2  | 4
    }
}
