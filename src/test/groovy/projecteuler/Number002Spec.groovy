package projecteuler

import spock.lang.Specification

class Number002Spec extends Specification {

    def "Test Problem 2 - [Even Fibonacci numbers]"() {
        expect:
        Number002.getEvenFibonacciNumbers(4000000) == 4613732
    }
}
