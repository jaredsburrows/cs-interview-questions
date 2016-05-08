package codingbat.recursion

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Array6Spec extends Specification {

    def "constructor"() {
        expect:
        new Array6() != null
    }

    def "array6"() {
        expect:
        Array6.array6(a as int[], b) == c

        where:
        a         | b || c
        [1, 6, 4] | 0 || true
        [1, 4]    | 0 || false
        [6]       | 0 || true
    }
}
