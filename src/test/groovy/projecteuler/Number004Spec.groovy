package projecteuler

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Number004Spec extends Specification {

    def "testGetLargestPalindromeProduct"() {
        expect:
        Number004.getLargestPalindromeProduct() == 906609
    }
}
