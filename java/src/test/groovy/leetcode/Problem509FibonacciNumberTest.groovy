package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem509FibonacciNumberTest extends Specification {
    @Unroll def 'fibonacci(#a) == #b'() {
        given:
        def sut = new Problem509FibonacciNumber()

        expect:
        sut.fib(a) == b

        where:
        a  || b
        -5 || -5
        -1 || -1
        0  || 0
        1  || 1
        2  || 1
        3  || 2
        4  || 3
        5  || 5
        6  || 8
        7  || 13
        8  || 21
    }
}
