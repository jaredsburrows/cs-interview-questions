package projecteuler

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Number002Spec extends BaseSpec {
    def "getEvenFibonacciNumbers"() {
        expect:
        Number002.getEvenFibonacciNumbers(4000000) == 4613732
    }
}
