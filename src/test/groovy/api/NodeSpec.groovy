package api

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class NodeSpec extends Specification {

    Node<Integer> node = new Node<>(123)
    Node<Integer> nextNode = new Node<>(123)

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
}
