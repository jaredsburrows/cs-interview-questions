package api

import nl.jqno.equalsverifier.EqualsVerifier
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class PointSpec extends BaseSpec {
    def sut = new Point(321, 123)

    def "getX"() {
        expect:
        sut.getX() == 321
    }

    def "getY"() {
        expect:
        sut.getY() == 123
    }

    def "equals/hashCode"() {
        when:
        EqualsVerifier.forClass(Point.class)
            .verify()

        then:
        noExceptionThrown()
    }
}
