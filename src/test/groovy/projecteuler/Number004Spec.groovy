package projecteuler

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Number004Spec extends BaseSpec {

    def "testGetLargestPalindromeProduct"() {
        expect:
        Number004.getLargestPalindromeProduct() == 906609
    }
}
