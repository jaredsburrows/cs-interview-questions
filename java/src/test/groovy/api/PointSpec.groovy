package api

import nl.jqno.equalsverifier.EqualsVerifier
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class PointSpec extends BaseSpec {
    def sut = new Point(321, 123)

    def "test getX"() {
        expect:
        sut.getX() == 321
    }

    def "test getY"() {
        expect:
        sut.getY() == 123
    }

    def "test equals/hashCode"() {
        when:
        EqualsVerifier.forClass(Point.class)
            .verify()

        then:
        noExceptionThrown()
    }
}
