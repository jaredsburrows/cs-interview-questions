package projecteuler

import spock.lang.Specification

class Number3Spec extends Specification {

    def "Test Problem 3 - [Largest prime factor]"() {
        expect:
        Number3.getLargestPrimeFactor(600851475143L) == 6857
    }
}
