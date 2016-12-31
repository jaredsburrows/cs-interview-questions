package questions.stringarraymatrix

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class ReturnSmallestCharacterSpec extends BaseSpec {

    @Unroll def "test findInsPoint2"() {
        expect:
        ReturnSmallestCharacter.findInsPoint2(a, b as char) == c as char

        where:
        a       | b   | c
        "abc"   | 'a' | 'b'
        "abc"   | 'b' | 'c'
        "abc"   | 'c' | 'a'
        "cfjpv" | 'a' | 'c'
        "cfjpv" | 'c' | 'f'
        "cfjpv" | 'k' | 'p'
        "cfjpv" | 'z' | 'c'
        "cfk"   | 'f' | 'k'
        "cfk"   | 'c' | 'f'
        "cfk"   | 'd' | 'f'
    }

    @Unroll def "test findInsPoint"() {
        expect:
        ReturnSmallestCharacter.findInsPoint(a, b as char) == c as char

        where:
        a       | b   | c
        "abc"   | 'a' | 'b'
        "abc"   | 'b' | 'c'
        "abc"   | 'c' | 'a'
        "cfjpv" | 'a' | 'c'
        "cfjpv" | 'c' | 'f'
        "cfjpv" | 'k' | 'p'
        "cfjpv" | 'z' | 'c'
        "cfk"   | 'f' | 'k'
        "cfk"   | 'c' | 'f'
        "cfk"   | 'd' | 'f'
    }
}
