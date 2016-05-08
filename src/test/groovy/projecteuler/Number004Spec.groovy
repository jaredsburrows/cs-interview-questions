package projecteuler

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Number004Spec extends Specification {

    def "Test Problem 4 - [Largest palindrome product]"() {
        expect:
        Number004.getLargestPalindromeProduct() == 906609
    }
}
