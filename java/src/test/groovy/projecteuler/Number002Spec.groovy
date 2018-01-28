package projecteuler

import test.BaseSpec

final class Number002Spec extends BaseSpec {
    def "getEvenFibonacciNumbers"() {
        expect:
        Number002.getEvenFibonacciNumbers(4000000) == 4613732
    }
}
