package questions.math

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class PalindromeNumberSpec extends BaseSpec {

    @SuppressWarnings("GroovyAssignabilityCheck")
    @Unroll def "test isPalindrome"() {
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
