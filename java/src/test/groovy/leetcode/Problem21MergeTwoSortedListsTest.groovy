package leetcode

import leetcode.api.ListNode
import spock.lang.Specification

final class Problem21MergeTwoSortedListsTest extends Specification {
    def 'addTwoNumbers'() {
        given:
        def sut = new Problem21MergeTwoSortedLists()

        def left = new ListNode(1)
        left.next = new ListNode(3)
        left.next.next = new ListNode(5)
        def right = new ListNode(2)
        right.next = new ListNode(4)
        right.next.next = new ListNode(6)

        def expected = new ListNode(1)
        expected.next = new ListNode(2)
        expected.next.next = new ListNode(3)
        expected.next.next.next = new ListNode(4)
        expected.next.next.next.next = new ListNode(5)
        expected.next.next.next.next.next = new ListNode(6)

        expect:
        sut.mergeTwoLists(null, null) == null
        sut.mergeTwoLists(null, left) == left
        sut.mergeTwoLists(right, null) == right

        def actual = sut.mergeTwoLists(left, right)
        actual == expected
    }
}
