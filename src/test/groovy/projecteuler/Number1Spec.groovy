package projecteuler

import spock.lang.Specification

class Number1Spec extends Specification {

    def "Test Problem 1 - [Multiples of 3 and 5]"() {
        expect:
        Number1.getMultiplesOf3And5ON() == 233168
        Number1.getMultiplesOf3And5() == 233168
    }
}
