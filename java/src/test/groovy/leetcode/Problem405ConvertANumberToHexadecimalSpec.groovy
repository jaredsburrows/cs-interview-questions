package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem405ConvertANumberToHexadecimalSpec extends Specification {
    @Unroll def "toHex(#num) = #answer"() {
        given:
        def sut = new Problem405ConvertANumberToHexadecimal()

        expect:
        sut.toHex(num) == answer

        where:
        num || answer
        26  || "1a"
        -1  || "ffffffff"
    }
}
