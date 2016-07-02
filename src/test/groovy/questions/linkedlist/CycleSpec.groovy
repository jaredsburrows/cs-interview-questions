package questions.linkedlist

import api.Node
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class CycleSpec extends BaseSpec {

    def "setup"() {
        node4 = new Node<>(4)

        //       n4 <- n3
        //        |     |
        // n0 -> n1 -> n2
        node0.next = node1
        node1.next = node2
        node2.next = node3
        node3.next = node4
    }

    def "test cycle - true"() {
        given:
        node4.next = node1

        expect:
        !Cycle.hasCycle(null)
        !Cycle.hasCycle(new Node<>(0))
        Cycle.hasCycle(node0)
    }

    def "test cycle - false"() {
        given:
        def nullNext = new Node<>(12)
        nullNext.next = null

        expect:
        !Cycle.hasCycle(null)
        !Cycle.hasCycle(nullNext)
        !Cycle.hasCycle(new Node<>(0))
        !Cycle.hasCycle(node0)
    }

    def "test cycle2"() {
        given:
        // n0 -> n1
        def node = new Node<>(1)
        node.next = new Node<>(2)

        expect:
        !Cycle.hasCycle(null)
        !Cycle.hasCycle(node)
    }
}
