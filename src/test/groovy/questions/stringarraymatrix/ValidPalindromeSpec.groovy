package questions.stringarraymatrix

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class ValidPalindromeSpec extends BaseSpec {

    @Unroll def "test isPalindrome"() {
        expect:
        ValidPalindrome.isPalindrome(a) == b

        where:
        a                                | b
        null                             | false
        "amaf"                           | false
        "race a car"                     | false
        "0P"                             | false
        "123"                            | false
        "123abc"                         | false
        ""                               | true
        "z"                              | true
        "ama"                            | true
        "A man, a plan, a canal: Panama" | true
        "aA"                             | true
    }
}
