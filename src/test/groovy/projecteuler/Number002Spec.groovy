package projecteuler

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Number002Spec extends Specification {

    def "testGetEvenFibonacciNumbers"() {
        expect:
        Number002.getEvenFibonacciNumbers(4000000) == 4613732
    }
}
