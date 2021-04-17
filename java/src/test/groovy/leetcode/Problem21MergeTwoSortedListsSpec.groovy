package leetcode

import leetcode.api.ListNode
import spock.lang.Shared
import spock.lang.Specification

final class Problem21MergeTwoSortedListsSpec extends Specification {
    @Shared private def left = new ListNode(1)
    @Shared private def right = new ListNode(2)
    @Shared private def expected = new ListNode(1)

    def 'setup'() {
        // L1: 1 -> 3 -> 5
        left.next = new ListNode(3)
        left.next.next = new ListNode(5)

        // L2: 2 -> 4 -> 6
        right.next = new ListNode(4)
        right.next.next = new ListNode(6)

        // L2: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        expected.next = new ListNode(2)
        expected.next.next = new ListNode(3)
        expected.next.next.next = new ListNode(4)
        expected.next.next.next.next = new ListNode(5)
        expected.next.next.next.next.next = new ListNode(6)
    }

    def 'iterative - addTwoNumbers'() {
        given:
        def sut = new Problem21MergeTwoSortedLists()

        expect:
        sut.mergeTwoLists(null, null) == null
        sut.mergeTwoLists(null, left) == left
        sut.mergeTwoLists(right, null) == right

        def actual = sut.mergeTwoLists(left, right)
        actual == expected
    }

    def 'recursive - addTwoNumbers'() {
        given:
        def sut = new Problem21MergeTwoSortedLists()

        expect:
        sut.mergeTwoLists2(null, null) == null
        sut.mergeTwoLists2(null, left) == left
        sut.mergeTwoLists2(right, null) == right

        def actual = sut.mergeTwoLists2(left, right)
        actual == expected
    }
}
