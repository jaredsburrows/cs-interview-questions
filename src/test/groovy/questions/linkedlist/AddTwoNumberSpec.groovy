package questions.linkedlist

import api.Node
import spock.lang.Specification

class AddTwoNumberSpec extends Specification {

    def "addTwoNumbers"() {
        given:
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers()
        // book
        // 315 + 592 = 808
        Node<Integer> book1 = new Node<>(3)
        book1.next = new Node<>(1)
        book1.next.next = new Node<>(5)

        Node<Integer> book2 = new Node<>(5)
        book2.next = new Node<>(9)
        book2.next.next = new Node<>(2)

        // programming geeks
        // 342 + 465 = 807
        Node<Integer> pg = new Node<>(2)
        pg.next = new Node<>(4)
        pg.next.next = new Node<>(3)

        Node<Integer> pg2 = new Node<>(5)
        pg2.next = new Node<>(6)
        pg2.next.next = new Node<>(4)

        // from 3 to 4 digits
        // 999 + 999 = 1998
        Node<Integer> nine = new Node<>(9)
        nine.next = new Node<>(9)
        nine.next.next = new Node<>(9)

        expect:
        addTwoNumbers.addTwoNumbers(null, nine) == null
        addTwoNumbers.addTwoNumbers(nine, null) == null
        addTwoNumbers.addTwoNumbers(null, null) == null

        Node<Integer> result = addTwoNumbers.addTwoNumbers(book1, book2)
        result.value == 8
        result.next.value == 0
        result.next.next.value == 8

        Node<Integer> result2 = addTwoNumbers.addTwoNumbers(pg, pg2)
        result2.value == 7
        result2.next.value == 0
        result2.next.next.value == 8

        Node<Integer> result3 = addTwoNumbers.addTwoNumbers(nine, nine)
        result3.value == 8
        result3.next.value == 9
        result3.next.next.value == 9
        result3.next.next.next.value == 1
    }
}
