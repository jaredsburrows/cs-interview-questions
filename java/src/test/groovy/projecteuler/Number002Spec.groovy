package projecteuler

import spock.lang.Specification

final class Number002Spec extends Specification {
    def 'getEvenFibonacciNumbers'() {
        expect:
        Number002.getEvenFibonacciNumbers(4000000) == 4613732
    }
}
