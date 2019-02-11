package api

import nl.jqno.equalsverifier.EqualsVerifier
import spock.lang.Specification

final class PointSpec extends Specification {
    private def sut = new Point(321, 123)

    def 'getX'() {
        expect:
        sut.getX() == 321
    }

    def 'getY'() {
        expect:
        sut.getY() == 123
    }

    def 'equals/hashCode'() {
        when:
        EqualsVerifier.forClass(Point.class)
            .verify()

        then:
        noExceptionThrown()
    }
}
