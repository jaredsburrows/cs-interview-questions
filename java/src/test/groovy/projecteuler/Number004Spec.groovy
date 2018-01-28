package projecteuler

import test.BaseSpec

final class Number004Spec extends BaseSpec {
    def "getLargestPalindromeProduct"() {
        expect:
        Number004.getLargestPalindromeProduct() == 906609
    }
}
