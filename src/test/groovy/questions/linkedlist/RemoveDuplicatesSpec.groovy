package questions.linkedlist

import spock.lang.Specification
import api.Node

class RemoveDuplicatesSpec extends Specification {

    RemoveDuplicates removeDuplicates

    def "setup"() {
        removeDuplicates = new RemoveDuplicates()
    }

    def "removeDuplicates - sorted"() {
        given:
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

    def "deleteEveryOther"() {
        given:
        Node<Integer> node = new Node<>(1)
        node.next = new Node<>(1)
        node.next.next = new Node<>(2)
        node.next.next.next = new Node<>(2)
        node.next.next.next.next = new Node<>(4)
        node.next.next.next.next.next = new Node<>(5)

        when:
        removeDuplicates.deleteEveryOtherRecursive(node)

        then:
        node.value == 1
        node.next.value == 2
        node.next.next.value == 4
    }
}
