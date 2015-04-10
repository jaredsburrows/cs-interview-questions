package crackingthecode.part1datastructures

import spock.lang.Ignore
import spock.lang.Specification
import util.ListNode

class Chapter2LinkedListsSpec extends Specification {

    @Ignore("fix later")
    def "removeDuplicates"() {
        ListNode listNode = new ListNode(1)
        listNode.next = new ListNode(1)
        listNode.next.next = new ListNode(2)
        listNode.next.next.next = new ListNode(2)
        listNode.next.next.next.next = new ListNode(4)
        listNode.next.next.next.next.next = new ListNode(5)

        expect:
        Chapter2LinkedLists.removeDuplicates(listNode)
        listNode.value == 1
        listNode.next.value == 2
//        listNode.next.next.value == 4
//        listNode.next.next.next.value == 5
    }

    def "findNthLastElement"() {
        ListNode listNode = new ListNode(0)
        listNode.next = new ListNode(1)
        listNode.next.next = new ListNode(2)
        listNode.next.next.next = new ListNode(3)
        listNode.next.next.next.next = new ListNode(4)
        listNode.next.next.next.next.next = new ListNode(5)

        expect:
        Chapter2LinkedLists.findNthLastElement(null, 6) == null
        Chapter2LinkedLists.findNthLastElement(listNode, 0) == null
        Chapter2LinkedLists.findNthLastElement(listNode, 6).value == 0
        Chapter2LinkedLists.findNthLastElement(listNode, 5).value == 1
        Chapter2LinkedLists.findNthLastElement(listNode, 4).value == 2
        Chapter2LinkedLists.findNthLastElement(listNode, 3).value == 3
        Chapter2LinkedLists.findNthLastElement(listNode, 2).value == 4
        Chapter2LinkedLists.findNthLastElement(listNode, 1).value == 5
    }
}
