package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class PairSpec extends Specification {

    def sut = new Pair<>("test", 123)

    def "getLeft"() {
        expect:
        sut.getLeft() == "test"
    }

    def "getRight"() {
        expect:
        sut.getRight() == 123
    }

    def "equals/hashcode"() {
        when:
        EqualsVerifier.forClass(Pair.class)
                .withPrefabValues(Pair.class, new Pair<>("a", 1), new Pair<>("b", 2))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }

    def "string"() {
        given:
        def actual = sut.toString()
        def expected = "Pair{mLeft=test, mRight=123}"

        expect:
        actual == expected
    }
}
