package projecteuler

import spock.lang.Specification

final class Number004Spec extends Specification {
    def 'getLargestPalindromeProduct'() {
        expect:
        Number004.getLargestPalindromeProduct() == 906609
    }
}
