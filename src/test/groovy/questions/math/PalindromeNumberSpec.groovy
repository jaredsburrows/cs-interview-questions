package questions.math

import test.BaseSpec
/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class PalindromeNumberSpec extends BaseSpec {

    def "isPalindrome"() {
        expect:
        PalindromeNumber.isPalindrome(a) == b

        where:
        a      | b
        -134   | false
        151    | true
        1      | true
        100001 | true
        123221 | false
    }
}
