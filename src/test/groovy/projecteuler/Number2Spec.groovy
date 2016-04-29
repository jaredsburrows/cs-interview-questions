package projecteuler

import spock.lang.Specification

class Number2Spec extends Specification {

    def "Test Problem 2 - [Even Fibonacci numbers]"() {
        expect:
        Number2.getEvenFibonacciNumbers(4000000) == 4613732
    }
}
