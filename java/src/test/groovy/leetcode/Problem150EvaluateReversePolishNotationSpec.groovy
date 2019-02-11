package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem150EvaluateReversePolishNotationSpec extends Specification {
    @Unroll def 'evalRPN(#tokens) = #answer'() {
        given:
        def sut = new Problem150EvaluateReversePolishNotation()

        expect:
        sut.evalRPN(tokens as String[]) == answer

        where:
        tokens                    || answer
        ['2', '1', '+', '3', '*'] || 9
    }
}
