package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem744FindSmallestLetterGreaterThanTargetSpec extends Specification {
    @Unroll def 'nextGreatestLetter(#letters, #target) = #answer'() {
        given:
        def sut = new Problem744FindSmallestLetterGreaterThanTarget()

        expect:
        sut.nextGreatestLetter(letters as char[], target as char) == answer as char

        where:
        letters         | target || answer
        ['c', 'f', 'j'] | 'a'    || 'c'
        ['c', 'f', 'j'] | 'c'    || 'f'
        ['c', 'f', 'j'] | 'd'    || 'f'
    }
}
