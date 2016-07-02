package questions.stringarraymatrix

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class ValidPalindromeSpec extends BaseSpec {

    def "test isPalindrome"() {
        expect:
        ValidPalindrome.isPalindrome(a) == b

        where:
        a                                | b
        "ama"                            | true
        "amaf"                           | false
        "A man, a plan, a canal: Panama" | true
        "race a car"                     | false
        "0P"                             | false
        "aA"                             | true
    }
}
