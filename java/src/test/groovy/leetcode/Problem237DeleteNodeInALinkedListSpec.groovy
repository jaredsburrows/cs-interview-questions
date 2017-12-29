package leetcode

import api.Node
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Problem237DeleteNodeInALinkedListSpec extends Specification {
    def "deleteNode"() {
        given:
        def list = new Node<>(1)
        list.next = new Node<>(2)
        list.next.next = new Node<>(3)
        list.next.next.next = new Node<>(4)

        expect:
        Problem237DeleteNodeInALinkedList.deleteNode(list.next.next)
        list.value == 1
        list.next.value == 2
        list.next.next.value == 4
        list.next.next.next == null
    }
}
