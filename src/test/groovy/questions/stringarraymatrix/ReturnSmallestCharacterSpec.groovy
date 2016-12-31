package questions.stringarraymatrix

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class ReturnSmallestCharacterSpec extends BaseSpec {

    def "test findInsPoint2"() {
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

    def "test findInsPoint"() {
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
