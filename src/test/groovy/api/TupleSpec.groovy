package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TupleSpec extends BaseSpec {

    def sut = new Tuple<>("test", 123)

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
        EqualsVerifier.forClass(Tuple.class)
                .withPrefabValues(Tuple.class, new Tuple<>(1, 2), new Tuple<>(3, 4))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }

    def "test toString"() {
        given:
        def actual = sut.toString()
        def expected = "Tuple{mLeft=test, mRight=123}"

        expect:
        actual == expected
    }
}
