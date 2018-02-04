package leetcode

import leetcode.api.ListNode
import test.BaseSpec

final class Problem2AddTwoNumbersSpec extends BaseSpec {
    def "addTwoNumbers"() {
        given:
        def sut = new Problem2AddTwoNumbers()

        // book
        // 315 + 592 = 808
        def book1 = new ListNode(3)
        book1.next = new ListNode(1)
        book1.next.next = new ListNode(5)

        def book2 = new ListNode(5)
        book2.next = new ListNode(9)
        book2.next.next = new ListNode(2)

        // programming geeks
        // 342 + 465 = 807
        def pg = new ListNode(2)
        pg.next = new ListNode(4)
        pg.next.next = new ListNode(3)

        def pg2 = new ListNode(5)
        pg2.next = new ListNode(6)
        pg2.next.next = new ListNode(4)

        // from 3 to 4 digits
        // 999 + 999 = 1998
        def nine = new ListNode(9)
        nine.next = new ListNode(9)
        nine.next.next = new ListNode(9)

        def shortNumber = new ListNode(1)
        shortNumber.next = new ListNode(1)

        def shorterNumber = new ListNode(1)
        shorterNumber.next = new ListNode(1)
        shorterNumber.next.next = new ListNode(1)

        expect:
        sut.addTwoNumbers(null, nine) == null
        sut.addTwoNumbers(nine, null) == null
        sut.addTwoNumbers(null, null) == null

        def result = sut.addTwoNumbers(book1, book2)
        result.val == 8
        result.next.val == 0
        result.next.next.val == 8

        def result2 = sut.addTwoNumbers(pg, pg2)
        result2.val == 7
        result2.next.val == 0
        result2.next.next.val == 8

        def result3 = sut.addTwoNumbers(nine, nine)
        result3.val == 8
        result3.next.val == 9
        result3.next.next.val == 9
        result3.next.next.next.val == 1

        def result4 = sut.addTwoNumbers(shortNumber, shorterNumber)
        result4.val == 2
        result4.next.val == 2
        result4.next.next.val == 1

        def result5 = sut.addTwoNumbers(shorterNumber, shortNumber)
        result5.val == 2
        result5.next.val == 2
        result5.next.next.val == 1
    }
}
