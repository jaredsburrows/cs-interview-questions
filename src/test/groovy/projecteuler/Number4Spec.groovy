package projecteuler

import spock.lang.Specification

class Number4Spec extends Specification {

    def "Test Problem 4 - [Largest palindrome product]"() {
        expect:
        Number4.getLargestPalindromeProduct() == 906609
    }
}
