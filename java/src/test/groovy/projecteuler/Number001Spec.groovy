package projecteuler

import spock.lang.Specification

final class Number001Spec extends Specification {
    def 'getMultiplesOf3And5'() {
        expect:
        Number001.getMultiplesOf3And5() == 233168
        Number001.getMultiplesOf3And52() == 233168
    }
}
