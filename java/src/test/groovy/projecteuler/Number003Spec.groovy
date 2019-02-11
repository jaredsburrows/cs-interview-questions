package projecteuler

import spock.lang.Specification

final class Number003Spec extends Specification {
    def 'getLargestPrimeFactor'() {
        expect:
        Number003.getLargestPrimeFactor(600851475143L) == 6857
    }
}
