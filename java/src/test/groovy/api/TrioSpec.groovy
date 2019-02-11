package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import spock.lang.Specification

final class TrioSpec extends Specification {
    def sut = new Trio<>('a', 1, 'a')

    def 'getFirst'() {
        expect:
        sut.getFirst() == 'a'
    }

    def 'getSecond'() {
        expect:
        sut.getSecond() == 1
    }

    def 'getThird'() {
        expect:
        sut.getThird() == 'a'
    }

    def 'equals/hashCode'() {
        when:
        EqualsVerifier.forClass(Trio.class)
            .withPrefabValues(Trio.class, new Trio<>('a', 1, 'a'), new Trio<>('b', 2, 'b'))
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()

        then:
        noExceptionThrown()
    }
}
