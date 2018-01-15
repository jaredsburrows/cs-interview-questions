package leetcode

import leetcode.api.ListNode
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class Problem2AddTwoNumbersSpec extends BaseSpec {
    def "addTwoNumbers"() {
        given:
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
        Problem2AddTwoNumbers.addTwoNumbers(null, nine) == null
        Problem2AddTwoNumbers.addTwoNumbers(nine, null) == null
        Problem2AddTwoNumbers.addTwoNumbers(null, null) == null

        def result = Problem2AddTwoNumbers.addTwoNumbers(book1, book2)
        result.value == 8
        result.next.value == 0
        result.next.next.value == 8

        def result2 = Problem2AddTwoNumbers.addTwoNumbers(pg, pg2)
        result2.value == 7
        result2.next.value == 0
        result2.next.next.value == 8

        def result3 = Problem2AddTwoNumbers.addTwoNumbers(nine, nine)
        result3.value == 8
        result3.next.value == 9
        result3.next.next.value == 9
        result3.next.next.next.value == 1

        def result4 = Problem2AddTwoNumbers.addTwoNumbers(shortNumber, shorterNumber)
        result4.value == 2
        result4.next.value == 2
        result4.next.next.value == 1

        def result5 = Problem2AddTwoNumbers.addTwoNumbers(shorterNumber, shortNumber)
        result5.value == 2
        result5.next.value == 2
        result5.next.next.value == 1
    }
}
