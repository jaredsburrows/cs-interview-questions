package crackingthecode.part2conceptsandalgorithms

import spock.lang.Ignore
import spock.lang.Specification

class Chapter6BrainTeasersSpec extends Specification {

    def "Test - arithmeticOperators [Correct Values]"() {
        expect:
        Chapter6BrainTeasers.arithmeticOperators() == 8
    }

    def "Test - chessPieces [Correct Values]"() {
        expect:
        Chapter6BrainTeasers.chessPieces() == 64
    }

    def "Test - exactJugs [Correct Values]"() {
        expect:
        Chapter6BrainTeasers.exactJugs() == 4
    }

    @Ignore
    def "Test - howLong [Correct Values]"() {
        expect:
        Chapter6BrainTeasers.nFloor() == 4
    }

    @Ignore
    def "Test - nFloor [Correct Values]"() {
        expect:
        Chapter6BrainTeasers.nFloor() == 4
    }

    def "Test - lockersOpen [Correct Values]"() {
        expect:
        Chapter6BrainTeasers.lockersOpen() == 10
    }
}
