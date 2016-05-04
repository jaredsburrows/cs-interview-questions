package crackingthecode.part2conceptsandalgorithms

import spock.lang.Ignore
import spock.lang.Specification

class Chapter6BrainTeasersSpec extends Specification {

    def "arithmeticOperators"() {
        expect:
        Chapter6BrainTeasers.arithmeticOperators() == 8
    }

    def "chessPieces"() {
        expect:
        Chapter6BrainTeasers.chessPieces() == 64
    }

    def "exactJugs"() {
        expect:
        Chapter6BrainTeasers.exactJugs() == 4
    }

    @Ignore
    def "howLong"() {
        expect:
        Chapter6BrainTeasers.nFloor() == 4
    }

    @Ignore
    def "nFloor"() {
        expect:
        Chapter6BrainTeasers.nFloor() == 4
    }

    def "lockersOpen"() {
        expect:
        Chapter6BrainTeasers.lockersOpen() == 10
    }
}
