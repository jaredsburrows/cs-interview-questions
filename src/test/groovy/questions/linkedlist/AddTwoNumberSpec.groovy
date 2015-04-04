package questions.linkedlist

import questions.util.ListNode
import spock.lang.Specification

class AddTwoNumberSpec extends Specification {

    def "addTwo"() {
        given:
        // book
        // 315 + 592 = 808
        ListNode book1 = new ListNode(3)
        book1.next = new ListNode(1)
        book1.next.next = new ListNode(5)

        ListNode book2 = new ListNode(5)
        book2.next = new ListNode(9)
        book2.next.next = new ListNode(2)

        // programming geeks
        // 342 + 465 = 807
        ListNode pg = new ListNode(2)
        pg.next = new ListNode(4)
        pg.next.next = new ListNode(3)

        ListNode pg2 = new ListNode(5)
        pg2.next = new ListNode(6)
        pg2.next.next = new ListNode(4)

        // from 3 to 4 digits
        // 999 + 999 = 1998
        ListNode nine = new ListNode(9)
        nine.next = new ListNode(9)
        nine.next.next = new ListNode(9)

        expect:
        AddTwoNumbers.addTwoNumbers(null, nine) == null
        AddTwoNumbers.addTwoNumbers(nine, null) == null
        AddTwoNumbers.addTwoNumbers(null, null) == null

        ListNode result = AddTwoNumbers.addTwoNumbers(book1, book2)
        result.value == 8
        result.next.value == 0
        result.next.next.value == 8

        ListNode result2 = AddTwoNumbers.addTwoNumbers(pg, pg2)
        result2.value == 7
        result2.next.value == 0
        result2.next.next.value == 8

        ListNode result3 = AddTwoNumbers.addTwoNumbers(nine, nine)
        result3.value == 8
        result3.next.value == 9
        result3.next.next.value == 9
        result3.next.next.next.value == 1
    }
}
