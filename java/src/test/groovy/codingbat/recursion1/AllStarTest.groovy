package codingbat.recursion1

import spock.lang.Specification
import spock.lang.Unroll

final class AllStarTest extends Specification {
    @Unroll def 'allStar(#str) = #answer'() {
        given:
        def sut = new AllStar()

        expect:
        sut.allStar(str) == answer

        where:
        str         || answer
        'hello'     || 'h*e*l*l*o'
        'abc'       || 'a*b*c'
        'ab'        || 'a*b'
        ''          || ''
        '3.14'      || '3*.*1*4'
        'Chocolate' || 'C*h*o*c*o*l*a*t*e'
        '1234'      || '1*2*3*4'
    }
}
