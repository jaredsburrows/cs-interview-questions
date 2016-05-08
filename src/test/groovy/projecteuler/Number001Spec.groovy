package projecteuler

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Number001Spec extends Specification {

    def "Test Problem 1 - [Multiples of 3 and 5]"() {
        expect:
        Number001.getMultiplesOf3And5ON() == 233168
        Number001.getMultiplesOf3And5() == 233168
    }
}
