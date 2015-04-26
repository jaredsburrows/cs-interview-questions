package questions.linkedlist

import spock.lang.Specification
import api.Node

class RemoveDuplicatesSpec extends Specification {

    def "removeDuplicates - sorted"() {
        given:
        RemoveDuplicates removeDuplicates = new RemoveDuplicates()
        Node<Integer> node = new Node<>(0)
        node.next = new Node<>(0)
        node.next.next = new Node<>(1)
        node.next.next.next = new Node<>(1)
        node.next.next.next.next = new Node<>(5)

        when:
        removeDuplicates.removeDuplicatesSorted(null)
        removeDuplicates.removeDuplicatesSorted(node)

        then:
        node.value == 0
        node.next.value == 1
        node.next.next.value == 5
    }
}
