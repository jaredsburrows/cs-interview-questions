package leetcode

import leetcode.api.ListNode
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Problem237DeleteNodeInALinkedListSpec extends Specification {
    def "deleteNode"() {
        given:
        def list = new ListNode(1)
        list.next = new ListNode(2)
        list.next.next = new ListNode(3)
        list.next.next.next = new ListNode(4)

        expect:
        Problem237DeleteNodeInALinkedList.deleteNode(list.next.next)
        list.value == 1
        list.next.value == 2
        list.next.next.value == 4
        list.next.next.next == null
    }
}
