package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class QueueSpec extends BaseSpec {
    def sut = new Queue<>()
    def valueNode = new Node<>(1)
    def valueNode2 = new Node<>(2)
    def valueNode3 = new Node<>(3)
    def blankNode = new Node<>(0)
    def blankNode2 = new Node<>(0)

    def "enqueue with constructor"() {
        given:
        def queue = new Queue<>(1)

        expect:
        queue.getFirst() == valueNode
        queue.add(valueNode2)
    }

    def "getFirst"() {
        expect:
        !sut.getFirst()
        sut.add(blankNode)
        sut.getFirst() == blankNode
    }

    def "getFirst - multiple"() {
        expect:
        !sut.getFirst()
        sut.add(blankNode)
        sut.getFirst() == blankNode
        sut.add(blankNode2)
        sut.getFirst() == blankNode
    }

    def "getLast"() {
        expect:
        !sut.getLast()
        sut.add(blankNode)
        sut.getLast() == blankNode
    }

    def "getLast - multiple"() {
        expect:
        !sut.getLast()
        sut.add(blankNode)
        sut.getLast() == blankNode
        sut.add(blankNode2)
        sut.getLast() == blankNode2
    }

    def "enqueue - single"() {
        expect:
        !sut.getFirst()
        sut.add(null)
        !sut.getFirst()
        sut.add(blankNode)
        sut.getFirst() == blankNode
    }

    def "enqueue - multiple"() {
        expect:
        !sut.getFirst()
        sut.add(null)
        !sut.getFirst()
        !sut.getLast()
        sut.add(valueNode)
        sut.getFirst() == valueNode
        sut.getLast() == valueNode
        sut.add(valueNode2)
        sut.getFirst() == valueNode
        sut.getLast() == valueNode2
        sut.add(valueNode3)
        sut.getFirst() == valueNode
        sut.getLast() == valueNode3
    }

    def "dequeue"() {
        expect:
        !sut.getFirst()
        sut.add(null)
        !sut.getFirst()
        !sut.getLast()
        sut.add(blankNode)
        sut.getFirst() == blankNode
        sut.getLast() == blankNode
        sut.poll()
        !sut.getFirst()
    }

    def "dequeue - multiple"() {
        expect:
        !sut.getFirst()
        sut.add(null)
        !sut.getFirst()
        !sut.getLast()
        sut.add(valueNode)
        sut.getFirst() == valueNode
        sut.getLast() == valueNode
        sut.add(valueNode2)
        sut.getFirst() == valueNode
        sut.getLast() == valueNode2
        sut.add(valueNode3)
        sut.getFirst() == valueNode
        sut.getLast() == valueNode3
        sut.poll()
        sut.getFirst() == valueNode2
        sut.poll()
        sut.getFirst() == valueNode3
        sut.poll()
        !sut.getFirst()
        sut.poll()
        !sut.getFirst()
    }

    def "equals/hashCode"() {
        when:
        EqualsVerifier.forClass(Queue.class)
            .withPrefabValues(Queue.class, new Queue<>(), new Queue<>(1))
            .withPrefabValues(Node.class, new Node<>(), new Node<>(1))
            .suppress(Warning.NONFINAL_FIELDS)
            .verify()

        then:
        noExceptionThrown()
    }
}
