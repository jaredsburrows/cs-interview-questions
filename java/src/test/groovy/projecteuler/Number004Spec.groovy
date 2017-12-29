package projecteuler

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Number004Spec extends BaseSpec {
    def "GetLargestPalindromeProduct"() {
        expect:
        Number004.getLargestPalindromeProduct() == 906609
    }
}
