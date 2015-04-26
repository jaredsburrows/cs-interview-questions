package questions.math

import spock.lang.Specification

class PalindromeNumberSpec extends Specification {

    def "isPalindrome"() {
        given:
        PalindromeNumber palindromeNumber = new PalindromeNumber()

        expect:
        palindromeNumber.isPalindrome(a) == b

        where:
        a      || b
        -134   || false
        151    || true
        1      || true
        100001 || true
        123221 || false
    }

}
