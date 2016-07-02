package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TrioSpec extends BaseSpec {

    def sut = new Trio<>("a", 1, 'a')

    def "getFirst"() {
        expect:
        sut.getFirst() == "a"
    }

    def "getSecond"() {
        expect:
        sut.getSecond() == 1
    }

    def "getThird"() {
        expect:
        sut.getThird() == 'a'
    }

    def "test equals/hashCode"() {
        when:
        EqualsVerifier.forClass(Trio.class)
                .withPrefabValues(Trio.class, new Trio<>("a", 1, 'a'), new Trio<>("b", 2, 'b'))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }

    def "test toString"() {
        given:
        def actual = sut.toString()
        def expected = "Trio{mFirst=a, mSecond=1, mThird=a}"

        expect:
        actual == expected
    }
}
