package codingbat.recursion

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class PowerNSpec extends BaseSpec {

    def "test powerN"() {
        expect:
        PowerN.powerN(a, b) == c

        where:
        a | b | c
        1 | 1 | 1
        3 | 1 | 3
        3 | 2 | 9
        3 | 3 | 27
    }
}
