package api

import nl.jqno.equalsverifier.EqualsVerifier
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class PointSpec extends Specification {

    def point = new Point(321, 123)

    def "getX"() {
        expect:
        point.getX() == 321
    }

    def "getY"() {
        expect:
        point.getY() == 123
    }

    def "equals"() {
        when:
        EqualsVerifier.forClass(Point.class).verify()

        then:
        noExceptionThrown()
    }
}
