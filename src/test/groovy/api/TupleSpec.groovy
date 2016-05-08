package api

import nl.jqno.equalsverifier.EqualsVerifier
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TupleSpec extends Specification {

    def tuple = new Tuple<>("test", 123)

    def "getX"() {
        expect:
        tuple.getX().equals("test")
    }

    def "getY"() {
        expect:
        tuple.getY() == 123
    }

    def "equals/hashcode"() {
        when:
        EqualsVerifier.forClass(Tuple.class).verify()

        then:
        noExceptionThrown()
    }
}
