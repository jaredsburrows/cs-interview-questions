package codingbat.recursion

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class FactorialSpec extends Specification {

    def "factorial"() {
        expect:
        Factorial.factorial(a) == b

        where:
        a || b
        1 || 1
        2 || 2
        3 || 6
    }
}
