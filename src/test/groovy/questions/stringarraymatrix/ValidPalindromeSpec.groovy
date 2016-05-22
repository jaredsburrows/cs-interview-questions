package questions.stringarraymatrix

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class ValidPalindromeSpec extends Specification {

    def "constructor"() {
        expect:
        new ValidPalindrome() != null
    }

    def "isPalindrome"() {
        expect:
        ValidPalindrome.isPalindrome(a) == b

        where:
        a                                || b
        "ama"                            || true
        "amaf"                           || false
        "A man, a plan, a canal: Panama" || true
        "race a car"                     || false
        "0P"                             || false
        "aA"                             || true
    }
}
