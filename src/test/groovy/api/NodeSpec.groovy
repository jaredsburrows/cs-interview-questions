package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class NodeSpec extends Specification {

    def node = new Node<>(123)
    def nextNode = new Node<>(123)

    def "default values"() {
        expect:
        node.value == 123
        node.next == null
        node.previous == null
    }

    def "getters/setters"() {
        when:
        node.next = nextNode
        node.previous = nextNode

        then:
        node.value == 123
        node.next.value == 123
        node.previous.value == 123
    }

    def "equals"() {
        when:
        EqualsVerifier.forClass(Node.class)
                .usingGetClass()
                .withPrefabValues(Node.class, new Node<>(1), new Node<>(2))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }
}
