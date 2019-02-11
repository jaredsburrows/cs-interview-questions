package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem165CompareVersionNumbersSpec extends Specification {
    @Unroll def 'compareVersion(#version1, #version2) = #answer'() {
        given:
        def sut = new Problem165CompareVersionNumbers()

        expect:
        sut.compareVersion(version1, version2) == answer

        where:
        version1  | version2 || answer
        '0.1'     | '1.1'    || -1
        '1.0.1'   | '1'      || 1
        '7.5.2.4' | '7.5.3'  || -1
    }
}
