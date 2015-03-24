package crackingthecode.part2conceptsandalgorithms

import spock.lang.Ignore
import spock.lang.Specification

class Chapter5BitManipulationSpec extends Specification {

    @Ignore
    def "Test - setBitPosition [Correct Values]"() {
        expect:
        Chapter5BitManipulation.setBitPosition(a as int, b, c, d) == e

        where:
        a           || b     || c || d || e
        10000000000 || 10101 || 2 || 6 || 10001010100
    }
}
