package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class NodeSpec extends BaseSpec {

    def sut = new Node<>()
    def nextNode = new Node<>(123)

    def "test default values"() {
        when:
        sut.value = 123

        then:
        sut.value == 123
        sut.next == null
        sut.previous == null
    }

    def "test getters/setters"() {
        when:
        sut.value = 123
        sut.next = nextNode
        sut.previous = nextNode

        then:
        sut.value == 123
        sut.next.value == 123
        sut.previous.value == 123
    }

    def "test equals/hashCode"() {
        when:
        EqualsVerifier.forClass(Node.class)
            .withPrefabValues(Node.class, new Node<>(), new Node<>(1))
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()

        then:
        noExceptionThrown()
    }
}
