package codingbat.recursion

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class FactorialSpec extends BaseSpec {

    def "test factorial"() {
        expect:
        Factorial.factorial(a) == b

        where:
        a | b
        1 | 1
        2 | 2
        3 | 6
    }
}
