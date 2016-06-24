package api

import nl.jqno.equalsverifier.EqualsVerifier
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class PointSpec extends Specification {

    def sut = new Point(321, 123)

    def "getX"() {
        expect:
        sut.getX() == 321
    }

    def "getY"() {
        expect:
        sut.getY() == 123
    }

    def "equals/hashcode"() {
        when:
        EqualsVerifier.forClass(Point.class).verify()

        then:
        noExceptionThrown()
    }

    def "string"() {
        given:
        def actual = sut.toString()
        def expected = "Point{mX=321, mY=123}"

        expect:
        actual == expected
    }
}
