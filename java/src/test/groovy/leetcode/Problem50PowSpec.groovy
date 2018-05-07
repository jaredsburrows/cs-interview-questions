package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem50PowSpec extends Specification {
    @Unroll def "myPow(#x, #n) = #answer"() {
        given:
        def sut = new Problem50Pow()

        expect:
        sut.myPow(x, n) == answer.toDouble()

        where:
        x       | n  || answer
        2.00000 | 10 || 1024.00000
//        2.10000 | 3  || 9.26100 // TODO double issue
        2.00000 | -2 || 0.25000
    }
}
