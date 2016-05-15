package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class GraphNodeSpec extends Specification {

    def graphNodes = [new GraphNode<>(123), new GraphNode<>(123)]
    def node2 = new GraphNode<Integer>(123, graphNodes as GraphNode<Integer>[])
    def node = new GraphNode<>(123)
    def nextNode = new GraphNode<>(123)

    def "default values"() {
        expect:
        node.value == 123
        node.next == null
        !node.visited

        node2.value == 123
        node2.neighbors.equals(graphNodes)
        node2.next == null
        !node2.visited
    }

    def "getters/setters"() {
        when:
        node.next = nextNode

        then:
        node.value == 123
        node.next.value == 123
    }

    def "equals"() {
        when:
        EqualsVerifier.forClass(GraphNode.class)
                .usingGetClass()
                .withPrefabValues(GraphNode.class, new GraphNode<>(1), new GraphNode<>(2))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }
}
