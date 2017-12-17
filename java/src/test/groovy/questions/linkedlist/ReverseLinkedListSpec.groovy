package questions.linkedlist

import api.Node
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class ReverseLinkedListSpec extends BaseSpec {
    def "test reverse"() {
        given:
        def node = new Node<>(1)
        node.next = new Node<>(2)
        node.next.next = new Node<>(3)
        node.next.next.next = new Node<>(4)
        node.next.next.next.next = new Node<>(5)

        when:
        def reverse = ReverseLinkedList.reverse(node)

        then:
        reverse.value == 5
        reverse.next.value == 4
        reverse.next.next.value == 3
        reverse.next.next.next.value == 2
        reverse.next.next.next.next.value == 1
    }
}
