package questions.stringarraymatrix

import questions.ReturnSmallestCharacter
import spock.lang.Unroll
import test.BaseSpec

final class ReturnSmallestCharacterSpec extends BaseSpec {
    @Unroll def "findInsPoint(#a, #b) == '#c'"() {
        expect:
        ReturnSmallestCharacter.findInsPoint(a, b as char) == c as char

        where:
        a       | b   || c
        "abc"   | 'a' || 'b'
        "abc"   | 'b' || 'c'
        "abc"   | 'c' || 'a'
        "cfjpv" | 'a' || 'c'
        "cfjpv" | 'c' || 'f'
        "cfjpv" | 'k' || 'p'
        "cfjpv" | 'z' || 'c'
        "cfk"   | 'f' || 'k'
        "cfk"   | 'c' || 'f'
        "cfk"   | 'd' || 'f'
    }
}
