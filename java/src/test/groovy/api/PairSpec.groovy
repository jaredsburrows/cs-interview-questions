package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import test.BaseSpec

final class PairSpec extends BaseSpec {
    def sut = new Pair<>("test", 123)

    def "getLeft"() {
        expect:
        sut.getLeft() == "test"
    }

    def "getRight"() {
        expect:
        sut.getRight() == 123
    }

    def "equals/hashCode"() {
        when:
        EqualsVerifier.forClass(Pair.class)
            .withPrefabValues(Pair.class, new Pair<>("a", 1), new Pair<>("b", 2))
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()

        then:
        noExceptionThrown()
    }
}
