package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class PairSpec extends BaseSpec {

    def sut = new Pair<>("test", 123)

    def "test getLeft"() {
        expect:
        sut.getLeft() == "test"
    }

    def "test getRight"() {
        expect:
        sut.getRight() == 123
    }

    def "test equals/hashCode"() {
        when:
        EqualsVerifier.forClass(Pair.class)
            .withPrefabValues(Pair.class, new Pair<>("a", 1), new Pair<>("b", 2))
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()

        then:
        noExceptionThrown()
    }
}
