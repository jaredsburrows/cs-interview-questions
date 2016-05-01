package projecteuler

import spock.lang.Specification

class Number004Spec extends Specification {

    def "Test Problem 4 - [Largest palindrome product]"() {
        expect:
        Number004.getLargestPalindromeProduct() == 906609
    }
}
