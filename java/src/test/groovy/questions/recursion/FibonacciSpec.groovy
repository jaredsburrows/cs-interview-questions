package questions.recursion

import questions.Fibonacci
import spock.lang.Specification
import spock.lang.Unroll

final class FibonacciSpec extends Specification {
    @Unroll def 'fibonacci(#a) == #b'() {
        expect:
        Fibonacci.fibonacci(a) == b

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
