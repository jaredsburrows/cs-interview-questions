package questions.linkedlist

import api.Node
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class CycleSpec extends BaseSpec {

    def "cycle - true"() {
        given:
        //       n4 <- n3
        //        |     |
        // n0 -> n1 -> n2
        def node0 = new Node<>(0)
        def node1 = new Node<>(1)
        def node2 = new Node<>(2)
        def node3 = new Node<>(3)
        def node4 = new Node<>(4)

        node0.next = node1
        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node1

        expect:
        !Cycle.hasCycle(null)
        !Cycle.hasCycle(new Node<>(0))
        Cycle.hasCycle(node0)
    }

    def "cycle - false"() {
        given:
        //       n4 <- n3
        //        |     |
        // n0 -> n1 -> n2
        def node0 = new Node<>(0)
        def node1 = new Node<>(1)
        def node2 = new Node<>(2)
        def node3 = new Node<>(3)
        def node4 = new Node<>(4)

        def nullNext = new Node<>(12)
        nullNext.next = null

        node0.next = node1
        node1.next = node2
        node2.next = node3
        node3.next = node4

        expect:
        !Cycle.hasCycle(null)
        !Cycle.hasCycle(nullNext)
        !Cycle.hasCycle(new Node<>(0))
        !Cycle.hasCycle(node0)
    }

    def "cycle2"() {
        given:
        // n0 -> n1
        def node = new Node<>(1)
        node.next = new Node<>(2)

        expect:
        !Cycle.hasCycle(null)
        !Cycle.hasCycle(node)
    }
}
