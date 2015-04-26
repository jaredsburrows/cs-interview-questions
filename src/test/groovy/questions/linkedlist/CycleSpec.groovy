package questions.linkedlist

import spock.lang.Specification
import api.Node

class CycleSpec extends Specification {

    def "cycle - true"() {
        given:
        Cycle cycle = new Cycle()
        //       n4 <- n3
        //        |     |
        // n0 -> n1 -> n2
        Node<Integer> node0 = new Node<>(0)
        Node<Integer> node1 = new Node<>(1)
        Node<Integer> node2 = new Node<>(2)
        Node<Integer> node3 = new Node<>(3)
        Node<Integer> node4 = new Node<>(4)

        node0.next = node1
        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node1

        expect:
        !cycle.hasCycle(null)
        !cycle.hasCycle(new Node<Integer>(0))
        cycle.hasCycle(node0)
    }

    def "cycle - false"() {
        given:
        Cycle cycle = new Cycle()
        //       n4 <- n3
        //        |     |
        // n0 -> n1 -> n2
        Node<Integer> node0 = new Node<>(0)
        Node<Integer> node1 = new Node<>(1)
        Node<Integer> node2 = new Node<>(2)
        Node<Integer> node3 = new Node<>(3)
        Node<Integer> node4 = new Node<>(4)

        node0.next = node1
        node1.next = node2
        node2.next = node3
        node3.next = node4

        expect:
        !cycle.hasCycle(null)
        !cycle.hasCycle(new Node<Integer>(0))
        !cycle.hasCycle(node0)
    }
}
