package leetcode

import leetcode.api.ListNode
import spock.lang.Specification

final class Problem237DeleteNodeInALinkedListSpec extends Specification {
    def "deleteNode"() {
        given:
        def sut = new Problem237DeleteNodeInALinkedList()
        def list = new ListNode(1)
        list.next = new ListNode(2)
        list.next.next = new ListNode(3)
        list.next.next.next = new ListNode(4)

        expect:
        sut.deleteNode(list.next.next)
        list.val == 1
        list.next.val == 2
        list.next.next.val == 4
        list.next.next.next == null
    }
}
