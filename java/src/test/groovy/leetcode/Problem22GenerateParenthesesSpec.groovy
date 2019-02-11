package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem22GenerateParenthesesSpec extends Specification {
    @Unroll def 'generateParenthesis(#n) = #answer'() {
        given:
        def sut = new Problem22GenerateParentheses()

        expect:
        sut.generateParenthesis(n) == answer

        where:
        n || answer
        0 || ['']
        1 || ['()']
        2 || ['(())', '()()']
        3 || ['((()))', '(()())', '(())()', '()(())', '()()()']
    }
}
