package projecteuler

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Number003Spec extends Specification {

    def "Test Problem 3 - [Largest prime factor]"() {
        expect:
        Number003.getLargestPrimeFactor(600851475143L) == 6857
    }
}
