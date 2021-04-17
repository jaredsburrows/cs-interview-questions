package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem1295FindNumbersWithEvenNumberOfDigitsSpec extends Specification {
    @Unroll def 'findNumbers(#nums) = #answer'() {
        given:
        def sut = new Problem1295FindNumbersWithEvenNumberOfDigits()

        expect:
        sut.findNumbers(nums as int[]) == answer
        sut.findNumbers2(nums as int[]) == answer

        where:
        nums                  || answer
        [12, 345, 2, 6, 7896] || 2
        [555, 901, 482, 1771] || 1
    }
}
