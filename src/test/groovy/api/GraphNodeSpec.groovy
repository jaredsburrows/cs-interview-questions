package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class GraphNodeSpec extends BaseSpec {

    def sut = new GraphNode<>()
    def graphNodes = [sut, sut] as GraphNode<Integer>[]
    def node2 = new GraphNode<>(123, graphNodes)

    def "test default values"() {
        when:
        sut.value = 123

        then:
        sut.value == 123
        sut.next == null
        !sut.visited

        node2.value == 123
        node2.neighbors.equals(graphNodes)
        node2.next == null
        !node2.visited
    }

    def "test getters/setters"() {
        when:
        sut.value = 123
        sut.next = sut

        then:
        sut.value == 123
        sut.next.value == 123
    }

    def "test equals/hashCode"() {
        when:
        EqualsVerifier.forClass(GraphNode.class)
                .withPrefabValues(GraphNode.class, new GraphNode<>(), new GraphNode<>(1))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }

    def "test toString"() {
        given:
        def actual = sut.toString()
        def expected = "GraphNode{value=null, next=null, neighbors=null, visited=false}"

        expect:
        actual == expected
    }
}
