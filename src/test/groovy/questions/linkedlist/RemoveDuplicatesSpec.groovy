package questions.linkedlist

import spock.lang.Specification
import api.Node

class RemoveDuplicatesSpec extends Specification {

    def "removeDuplicates - sorted"() {
        given:
        Node<Integer> node = new Node<>(0)
        node.next = new Node<>(0)
        node.next.next = new Node<>(1)
        node.next.next.next = new Node<>(1)
        node.next.next.next.next = new Node<>(5)

        when:
        RemoveDuplicates.removeDuplicatesSorted(node)

        then:
        node.value == 0
        node.next.value == 1
        node.next.next.value == 5
    }
}
