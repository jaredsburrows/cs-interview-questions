package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TupleSpec extends Specification {

    def tuple = new Tuple<>("test", 123)

    def "getX"() {
        expect:
        tuple.getX() == "test"
    }

    def "getY"() {
        expect:
        tuple.getY() == 123
    }

    def "equals/hashcode"() {
        when:
        EqualsVerifier.forClass(Tuple.class)
                .usingGetClass()
                .withPrefabValues(Tuple.class, new Tuple<>(1, 2), new Tuple<>(3, 4))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }
}
