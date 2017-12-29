package codingbat.recursion

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class FactorialSpec extends BaseSpec {
    @Unroll def "factorial(#a) == '#b'"() {
        expect:
        Factorial.factorial(a) == b

        where:
        a || b
        1 || 1
        2 || 2
        3 || 6
    }
}
