package api

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class GraphNodeSpec extends Specification {

    GraphNode<Integer>[] graphNodes = [new GraphNode<>(123), new GraphNode<>(123)]
    GraphNode<Integer> node2 = new  GraphNode<Integer>(123, graphNodes)
    GraphNode<Integer> node = new GraphNode<>(123)
    GraphNode<Integer> nextNode = new GraphNode<>(123)

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
}
